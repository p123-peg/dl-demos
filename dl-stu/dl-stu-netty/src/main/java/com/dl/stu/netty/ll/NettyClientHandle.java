package com.dl.stu.netty.ll;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.CharsetUtil;
import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.concurrent.FutureListener;

import java.nio.ByteBuffer;

/**
 * @author liuziqiang
 * @date 2022/08/31 16:15
 */

public class NettyClientHandle implements ChannelInboundHandler {

    @Override
    public void channelRegistered(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void channelUnregistered(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ChannelFuture future = ctx.writeAndFlush(Unpooled.copiedBuffer("channelActive  Netty客户端...", CharsetUtil.UTF_8));
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future1) throws Exception {
                if (future1.isSuccess()) {
                    System.out.println("数据发送成功！");
                }
            }
        });
    }

    @Override
    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuffer = (ByteBuf) msg;
        System.out.println("channelRead服务器发来信息为：" + byteBuffer.toString());
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

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

    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {

    }

}