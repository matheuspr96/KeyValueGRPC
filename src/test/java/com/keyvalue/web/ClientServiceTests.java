package com.keyvalue.web;

import com.keyvalue.web.model.*;
import com.keyvalue.web.services.ClientService;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootTest
class ClientServiceTests {
    private static final Logger logger = Logger.getLogger(ClientService.class.getName());

    // private final CrudKeyValueGrpc.CrudKeyValueBlockingStub blockingStub;
    ClientService clientService;

    public ClientServiceTests(Channel channel) {
        clientService = new ClientService(channel);
    }

    public Comunicacao.Reply set(byte[] key, long ts, byte[] data) {

        Comunicacao.Reply response;
        try {
            return clientService.set(key, ts, data);
        } catch (StatusRuntimeException e) {
            return null;
        }
    }

    public Comunicacao.Reply get(byte[] key) {

        Comunicacao.Reply response;
        try {
            return clientService.get(key);
        } catch (StatusRuntimeException e) {
            return null;
        }
    }

    public Comunicacao.Reply del(byte[] key) {

        Comunicacao.Reply response;
        try {
            return clientService.del(key);
        } catch (StatusRuntimeException e) {
            return null;
        }
    }

    public Comunicacao.Reply delVers(byte[] key, long version) {

        Comunicacao.Reply response;
        try {
            return clientService.delVers(key, version);
        } catch (StatusRuntimeException e) {
            return null;
        }
    }

    public Comunicacao.Reply testAndSet(byte[] key, long version, long ts, byte[] data, long vers) {

        Comunicacao.Reply response;
        try {
            return clientService.testAndSet(key, version, ts, data, vers);
        } catch (StatusRuntimeException e) {
            return null;
        }
    }

    @Test
    public static void main(String[] args) throws Exception {
        String target = "localhost:8980";

        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();

        try {
            Logger.getLogger("io.grpc").setLevel(Level.WARNING);

            ClientServiceTests client2 = new ClientServiceTests(channel);
            byte[] data = "Data Test".getBytes();

            Comunicacao.Reply response;
            client2.set("002".getBytes(), 00000, data); // AUX
            client2.set("003".getBytes(), 00000, data); // AUX

            response = client2.set("001".getBytes(), 00001, data); // success
            LogError(response, "Set Data in 001");

            response = client2.set("001".getBytes(), 00002, data); // error
            LogError(response, "Set Data in 001");

            response = client2.get("001".getBytes()); // success
            LogError(response, "Get Data from 001");

            response = client2.get("00x".getBytes()); // error
            LogError(response, "Get Data from 00x");

            response = client2.del("001".getBytes()); // success
            LogError(response, "Delete Data from 001");

            response = client2.del("00x".getBytes()); // error
            LogError(response, "Delete Data from 00x");

            response = client2.delVers("002".getBytes(), 2); // error WV
            LogError(response, "Delete(Version 2) Data from 002", " WV");

            response = client2.delVers("002".getBytes(), 1); // success
            LogError(response, "Delete(Version 1) Data from 002");

            response = client2.delVers("00x".getBytes(), 1); // error NE
            LogError(response, "Delete(Version 1) Data from 00x");

            response = client2.testAndSet("003".getBytes(), 2, 00003, data, 1); // success
            LogError(response, "TestAndSet(Version 1) Data from 003");

            response = client2.testAndSet("003".getBytes(), 2, 00004, data, 3); // error WV
            LogError(response, "TestAndSet(Version 3) Data from 003", " WV");

            response = client2.testAndSet("00x".getBytes(), 3, 00005, data, 5); // error NE
            LogError(response, "TestAndSet(Version 5) Data from 00x", " NE");

            String str;
            byte[] strBytes;

            for (int i = 0; i <= 1000; i++) {
                str = "00" + i;
                strBytes = str.getBytes();

                Comunicacao.Reply responseT = client2.set(strBytes, i, strBytes);
                LogError(responseT, String.format("Set Data in %4.0f", (float) i));
            }

        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

    private static void LogError(Comunicacao.Reply Reply, String PreMessage, String PostMessage) {
        logger.info(
                PreMessage + " - " + (Objects.equals(Reply.getError(), "SUCCESS") ? "Success" : "Error") + PostMessage);
    }

    private static void LogError(Comunicacao.Reply Reply, String PreMessage) {
        LogError(Reply, PreMessage, "");
    }
}
