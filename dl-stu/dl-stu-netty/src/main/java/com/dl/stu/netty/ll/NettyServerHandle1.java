package com.dl.stu.netty.ll;


import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.util.CharsetUtil;

import java.nio.ByteBuffer;


/**
 * @author liuziqiang
 * @date 2022/08/31 15:44
 */
public class NettyServerHandle1 implements ChannelInboundHandler {
    /**
     * @param channelHandlerContext
     * @throws Exception 通道处理事件
     */
    @Override
    public void channelRegistered(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void channelUnregistered(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    /**
     * 通道就绪
     *
     * @param channelHandlerContext
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        System.out.println("channelActive....通道就绪！！");
    }

    @Override
    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    /**
     * 读取
     *
     * @param channelHandlerContext
     * @param msg
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception {

        System.out.println("channelRead.....读取");
        ByteBuf byteBuffer = (ByteBuf) msg;
        System.out.println("客户端发来的信息：" + byteBuffer.toString());

    }

    /**
     * 读取完毕
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelReadComplete.....");
        ctx.writeAndFlush(Unpooled.copiedBuffer("你好,我是Netty服务端.", CharsetUtil.UTF_8));
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {

    }

    @Override
    public void channelWritabilityChanged(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    /**
     * 异常发生事件
     *
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("exceptionCaught...异常发生事件");
        cause.printStackTrace();
        ctx.close();
    }
}