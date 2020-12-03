package com.keyvalue.web.services;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.keyvalue.web.repository.*;


public class ClientService {
    private static final Logger logger = Logger.getLogger(ClientService.class.getName());

  private final GreeterGrpc.GreeterBlockingStub blockingStub;

  /** construtor que realiza a conexao com o server pelo canal channel **/
  public ClientService(Channel channel) {
    blockingStub = GreeterGrpc.newBlockingStub(channel);
  }

  /** funções q conversa com o server */
  public void greet(String name) {
    logger.info("Will try to greet " + name + " ...");
    HelloRequest request = HelloRequest.newBuilder().setName(name).build();
    HelloReply response;
    try {
      response = blockingStub.sayHello(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getMessage());
  }

  public void set(int k, int ts, int d) {
    SetRequest request;
    request = SetRequest.newBuilder().setK(k).build();
    request = SetRequest.newBuilder().setTs(ts).build();
    request = SetRequest.newBuilder().setD(d).build();
    Reply response;
    try {
      response = blockingStub.set(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getError());
  }

  public void get(int k) {
    GetRequest request;
    request = GetRequest.newBuilder().setK(k).build();
    Reply response;
    try {
      response = blockingStub.get(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getError());
  }

  public void del(int k) {
    DelRequest request;
    request = DelRequest.newBuilder().setK(k).build();
    Reply response;
    try {
      response = blockingStub.del(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getError());
  }

  public void delVers(int k, int vers) {
    DelRequestVers request;
    request = DelRequestVers.newBuilder().setK(k).build();
    request = DelRequestVers.newBuilder().setVers(vers).build();
    Reply response;
    try {
      response = blockingStub.delVers(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getError());
  }

  public void testAndSet(int k, int vers2, int ts, int d, int vers) {
    VTripla request_vtripla;
    request_vtripla = VTripla.newBuilder().setVers(vers2).build();
    request_vtripla = VTripla.newBuilder().setTs(ts).build();
    request_vtripla = VTripla.newBuilder().setD(d).build();

    TestAndSetRequest request;
    request = TestAndSetRequest.newBuilder().setK(k).build();
    request = TestAndSetRequest.newBuilder().setVers(vers).build();
    request = TestAndSetRequest.newBuilder().setV(request_vtripla).build();
    
    Reply response;
    try {
      response = blockingStub.testAndSet(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getError());
  }

  /** realiza a conexao com o server e chama as funções **/
  public static void main(String[] args) throws Exception {
    String user = "world";
    String user2 = "babana";
    String target = "localhost:50051"; // Access a service running on the local machine on port 50051

    // Create a communication channel to the server, known as a Channel.
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
        .usePlaintext()
        .build();

    // realiza a comunicação com o server
    try {
      int sair = 1;
      ClientService client2 = new ClientService(channel);
      System.out.println("\n\nBem Vindo ao nosso Banco de Dados NoSQL Rudimentar!!!\n\n");
      while (sair == 1) {
        System.out.println("Escolha uma das funções abaixo:");
        System.out.println("1 - Set");
        System.out.println("2 - Get");
        System.out.println("3 - Delete");
        System.out.println("4 - Delete Version");
        System.out.println("5 - Test And Set");
        System.out.println("6 - Sair");
	int choice = 1;

        if (choice == 1) {
          // pega os valores do usuario
          client2.set(4,5,8);        
        } else if (choice == 2) {
          // pega os valores do usuario
          client2.get(8);
        } else if (choice == 3) {
          // pega os valores do usuario
          client2.del(5);
        } else if (choice == 4) {
          // pega os valores do usuario
          client2.delVers(4,8);
        } else if (choice == 5) {
          // pega os valores do usuario
          client2.testAndSet(4,5,8,5,5);
        } else if (choice == 6) {
          sair = 0;
        }
      }
    } finally {
      System.out.println("\n\nObrigado por usar nossos serviços, volte sempre!!!");
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
