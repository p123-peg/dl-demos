package com.dl.stu.netty;

import io.netty.channel.local.LocalAddress;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * @author liuziqiang
 * @date 2022/08/09 11:05
 */
public class NioClient {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
      socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999));
        socketChannel.write(ByteBuffer.wrap("来自客户端...".getBytes(StandardCharsets.UTF_8)));
      //读
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int read = socketChannel.read(byteBuffer);
        System.out.println("来自服务端的信息" + new String(byteBuffer.array(),0,read, StandardCharsets.UTF_8));

        socketChannel.close();



    }
}