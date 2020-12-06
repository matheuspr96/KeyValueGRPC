// package com.keyvalue.web;

// import java.util.concurrent.TimeUnit;

// import com.keyvalue.web.repository.CrudKeyValueGrpc;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// import io.grpc.ManagedChannel;
// import io.grpc.ManagedChannelBuilder;
// import io.grpc.StatusRuntimeException;

// @SpringBootTest
// class DbNosqlApplicationTests {

//   public class ClientService {
//     private final CrudKeyValueGrpc.CrudKeyValueBlockingStub blockingStub;

//     public static void main(String[] args) throws Exception {
//       String target = "localhost:8980";

//       ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();

//       try {
//         ClientService client2 = new ClientService(channel);
//         byte[] key = { 01, 66, 78, 75, 65, 74 };
//         byte[] data = { 01, 65, 78, 75, 75, 75 };

//         client2.set(key, 55, data);
//         // client2.get(key);
//         // client2.del(key);
//         // client2.delVers(key,1);
//         // client2.testAndSet(key,3,54,data,1);

//       } finally {
//         channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
//       }
//     }
//   }

//   @Test
//   public void testAndSet() {
//     try {
//       response = blockingStub.testAndSet(request);
//     } catch (StatusRuntimeException e) {
//       logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
//       return;
//     }
//     logger.info("testAndSet: " + response);
//   }

// }
