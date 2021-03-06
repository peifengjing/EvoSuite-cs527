/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 02:21:51 GMT 2017
 */

package org.asynchttpclient.extras.rxjava2.maybe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.EmptyByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.UnpooledDirectByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.handler.codec.http.CombinedHttpHeaders;
import io.netty.handler.codec.http.EmptyHttpHeaders;
import io.reactivex.MaybeEmitter;
import java.lang.reflect.Method;
import java.sql.SQLWarning;
import java.time.chrono.ChronoLocalDate;
import org.asynchttpclient.AbstractBasicTest;
import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.HttpResponseBodyPart;
import org.asynchttpclient.HttpResponseStatus;
import org.asynchttpclient.Realm;
import org.asynchttpclient.extras.rxjava2.maybe.MaybeAsyncHandlerBridge;
import org.asynchttpclient.extras.rxjava2.maybe.ProgressAsyncMaybeEmitterBridge;
import org.asynchttpclient.handler.ProgressAsyncHandler;
import org.asynchttpclient.netty.EagerResponseBodyPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractMaybeAsyncHandlerBridge_ESTest extends AbstractMaybeAsyncHandlerBridge_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MaybeEmitter<Method> maybeEmitter0 = (MaybeEmitter<Method>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter0).isDisposed();
      ProgressAsyncHandler<Method> progressAsyncHandler0 = (ProgressAsyncHandler<Method>) mock(ProgressAsyncHandler.class, new ViolatedAssumptionAnswer());
      ProgressAsyncMaybeEmitterBridge<Method> progressAsyncMaybeEmitterBridge0 = new ProgressAsyncMaybeEmitterBridge<Method>(maybeEmitter0, progressAsyncHandler0);
      MaybeEmitter<Object> maybeEmitter1 = (MaybeEmitter<Object>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter1).isDisposed();
      MaybeAsyncHandlerBridge<Object> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<Object>(maybeEmitter1, progressAsyncMaybeEmitterBridge0);
      maybeAsyncHandlerBridge0.onThrowable((Throwable) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MaybeEmitter<ChronoLocalDate> maybeEmitter0 = (MaybeEmitter<ChronoLocalDate>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      AsyncHandler<ChronoLocalDate> asyncHandler0 = (AsyncHandler<ChronoLocalDate>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      MaybeAsyncHandlerBridge<ChronoLocalDate> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<ChronoLocalDate>(maybeEmitter0, asyncHandler0);
      AsyncHandler<? extends ChronoLocalDate> asyncHandler1 = maybeAsyncHandlerBridge0.delegate();
      assertNotNull(asyncHandler1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MaybeEmitter<ChannelOutboundHandlerAdapter> maybeEmitter0 = (MaybeEmitter<ChannelOutboundHandlerAdapter>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter0).isDisposed();
      AsyncHandler<ChannelOutboundHandlerAdapter> asyncHandler0 = (AsyncHandler<ChannelOutboundHandlerAdapter>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(asyncHandler0).onCompleted();
      MaybeAsyncHandlerBridge<ChannelOutboundHandlerAdapter> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<ChannelOutboundHandlerAdapter>(maybeEmitter0, asyncHandler0);
      MaybeEmitter<Void> maybeEmitter1 = (MaybeEmitter<Void>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter1).isDisposed();
      MaybeAsyncHandlerBridge<Void> maybeAsyncHandlerBridge1 = new MaybeAsyncHandlerBridge<Void>(maybeEmitter1, maybeAsyncHandlerBridge0);
      maybeAsyncHandlerBridge1.onCompleted();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SQLWarning sQLWarning0 = new SQLWarning();
      MaybeEmitter<MockHijrahDate> maybeEmitter0 = (MaybeEmitter<MockHijrahDate>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(maybeEmitter0).isDisposed();
      AsyncHandler<MockHijrahDate> asyncHandler0 = (AsyncHandler<MockHijrahDate>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      MaybeAsyncHandlerBridge<MockHijrahDate> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<MockHijrahDate>(maybeEmitter0, asyncHandler0);
      maybeAsyncHandlerBridge0.onThrowable(sQLWarning0);
      assertEquals(0, sQLWarning0.getErrorCode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MaybeEmitter<EmptyByteBuf> maybeEmitter0 = (MaybeEmitter<EmptyByteBuf>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      ProgressAsyncHandler<EmptyByteBuf> progressAsyncHandler0 = (ProgressAsyncHandler<EmptyByteBuf>) mock(ProgressAsyncHandler.class, new ViolatedAssumptionAnswer());
      ProgressAsyncMaybeEmitterBridge<EmptyByteBuf> progressAsyncMaybeEmitterBridge0 = new ProgressAsyncMaybeEmitterBridge<EmptyByteBuf>(maybeEmitter0, progressAsyncHandler0);
      progressAsyncMaybeEmitterBridge0.disposed();
      MaybeEmitter<String> maybeEmitter1 = (MaybeEmitter<String>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      AbstractBasicTest.AsyncHandlerAdapter abstractBasicTest_AsyncHandlerAdapter0 = new AbstractBasicTest.AsyncHandlerAdapter();
      MaybeAsyncHandlerBridge<String> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<String>(maybeEmitter1, abstractBasicTest_AsyncHandlerAdapter0);
      // Undeclared exception!
      try { 
        maybeAsyncHandlerBridge0.disposed();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Unexpected exception
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MaybeEmitter<EmptyByteBuf> maybeEmitter0 = (MaybeEmitter<EmptyByteBuf>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter0).isDisposed();
      AsyncHandler<EmptyByteBuf> asyncHandler0 = (AsyncHandler<EmptyByteBuf>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      MaybeAsyncHandlerBridge<EmptyByteBuf> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<EmptyByteBuf>(maybeEmitter0, asyncHandler0);
      // Undeclared exception!
      try { 
        maybeAsyncHandlerBridge0.onThrowable((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.asynchttpclient.extras.rxjava2.maybe.AbstractMaybeAsyncHandlerBridge", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MaybeEmitter<Realm.AuthScheme> maybeEmitter0 = (MaybeEmitter<Realm.AuthScheme>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(maybeEmitter0).isDisposed();
      AsyncHandler<Realm.AuthScheme> asyncHandler0 = (AsyncHandler<Realm.AuthScheme>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(asyncHandler0).onCompleted();
      MaybeAsyncHandlerBridge<Realm.AuthScheme> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<Realm.AuthScheme>(maybeEmitter0, asyncHandler0);
      maybeAsyncHandlerBridge0.onCompleted();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MaybeEmitter<ChronoLocalDate> maybeEmitter0 = (MaybeEmitter<ChronoLocalDate>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(maybeEmitter0).isDisposed();
      MockLocalDate.now();
      AsyncHandler<ChronoLocalDate> asyncHandler0 = (AsyncHandler<ChronoLocalDate>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(asyncHandler0).onCompleted();
      MaybeAsyncHandlerBridge<ChronoLocalDate> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<ChronoLocalDate>(maybeEmitter0, asyncHandler0);
      maybeAsyncHandlerBridge0.onCompleted();
      AsyncHandler.State asyncHandler_State0 = maybeAsyncHandlerBridge0.disposed();
      assertEquals(AsyncHandler.State.ABORT, asyncHandler_State0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MaybeEmitter<MockJapaneseDate> maybeEmitter0 = (MaybeEmitter<MockJapaneseDate>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter0).isDisposed();
      ProgressAsyncHandler<MockJapaneseDate> progressAsyncHandler0 = (ProgressAsyncHandler<MockJapaneseDate>) mock(ProgressAsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(progressAsyncHandler0).onCompleted();
      ProgressAsyncMaybeEmitterBridge<MockJapaneseDate> progressAsyncMaybeEmitterBridge0 = new ProgressAsyncMaybeEmitterBridge<MockJapaneseDate>(maybeEmitter0, progressAsyncHandler0);
      progressAsyncMaybeEmitterBridge0.onCompleted();
      SQLWarning sQLWarning0 = new SQLWarning();
      progressAsyncMaybeEmitterBridge0.onThrowable(sQLWarning0);
      assertEquals("java.sql.SQLWarning", sQLWarning0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CombinedHttpHeaders combinedHttpHeaders0 = new CombinedHttpHeaders(false);
      MaybeEmitter<Realm.AuthScheme> maybeEmitter0 = (MaybeEmitter<Realm.AuthScheme>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter0).isDisposed();
      ProgressAsyncHandler<Realm.AuthScheme> progressAsyncHandler0 = (ProgressAsyncHandler<Realm.AuthScheme>) mock(ProgressAsyncHandler.class, new ViolatedAssumptionAnswer());
      ProgressAsyncMaybeEmitterBridge<Realm.AuthScheme> progressAsyncMaybeEmitterBridge0 = new ProgressAsyncMaybeEmitterBridge<Realm.AuthScheme>(maybeEmitter0, progressAsyncHandler0);
      AsyncHandler.State asyncHandler_State0 = progressAsyncMaybeEmitterBridge0.onTrailingHeadersReceived(combinedHttpHeaders0);
      assertEquals(AsyncHandler.State.ABORT, asyncHandler_State0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MaybeEmitter<EmptyByteBuf> maybeEmitter0 = (MaybeEmitter<EmptyByteBuf>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(maybeEmitter0).isDisposed();
      ProgressAsyncHandler<EmptyByteBuf> progressAsyncHandler0 = (ProgressAsyncHandler<EmptyByteBuf>) mock(ProgressAsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((AsyncHandler.State) null).when(progressAsyncHandler0).onTrailingHeadersReceived(any(io.netty.handler.codec.http.HttpHeaders.class));
      ProgressAsyncMaybeEmitterBridge<EmptyByteBuf> progressAsyncMaybeEmitterBridge0 = new ProgressAsyncMaybeEmitterBridge<EmptyByteBuf>(maybeEmitter0, progressAsyncHandler0);
      CombinedHttpHeaders combinedHttpHeaders0 = new CombinedHttpHeaders(false);
      progressAsyncMaybeEmitterBridge0.onTrailingHeadersReceived(combinedHttpHeaders0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MaybeEmitter<ChannelOutboundHandlerAdapter> maybeEmitter0 = (MaybeEmitter<ChannelOutboundHandlerAdapter>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter0).isDisposed();
      AsyncHandler<ChannelOutboundHandlerAdapter> asyncHandler0 = (AsyncHandler<ChannelOutboundHandlerAdapter>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      MaybeAsyncHandlerBridge<ChannelOutboundHandlerAdapter> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<ChannelOutboundHandlerAdapter>(maybeEmitter0, asyncHandler0);
      CombinedHttpHeaders combinedHttpHeaders0 = new CombinedHttpHeaders(false);
      AsyncHandler.State asyncHandler_State0 = maybeAsyncHandlerBridge0.onHeadersReceived(combinedHttpHeaders0);
      assertEquals(AsyncHandler.State.ABORT, asyncHandler_State0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MaybeEmitter<ChannelInboundHandlerAdapter> maybeEmitter0 = (MaybeEmitter<ChannelInboundHandlerAdapter>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(maybeEmitter0).isDisposed();
      ProgressAsyncHandler<ChannelDuplexHandler> progressAsyncHandler0 = (ProgressAsyncHandler<ChannelDuplexHandler>) mock(ProgressAsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((AsyncHandler.State) null).when(progressAsyncHandler0).onHeadersReceived(any(io.netty.handler.codec.http.HttpHeaders.class));
      ProgressAsyncMaybeEmitterBridge<ChannelInboundHandlerAdapter> progressAsyncMaybeEmitterBridge0 = new ProgressAsyncMaybeEmitterBridge<ChannelInboundHandlerAdapter>(maybeEmitter0, progressAsyncHandler0);
      EmptyHttpHeaders emptyHttpHeaders0 = EmptyHttpHeaders.INSTANCE;
      progressAsyncMaybeEmitterBridge0.onHeadersReceived(emptyHttpHeaders0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MaybeEmitter<Object> maybeEmitter0 = (MaybeEmitter<Object>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter0).isDisposed();
      AsyncHandler<AsyncHttpClientConfig.ResponseBodyPartFactory> asyncHandler0 = (AsyncHandler<AsyncHttpClientConfig.ResponseBodyPartFactory>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      MaybeAsyncHandlerBridge<Object> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<Object>(maybeEmitter0, asyncHandler0);
      AsyncHandler.State asyncHandler_State0 = maybeAsyncHandlerBridge0.onStatusReceived((HttpResponseStatus) null);
      assertEquals(AsyncHandler.State.ABORT, asyncHandler_State0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MaybeEmitter<Object> maybeEmitter0 = (MaybeEmitter<Object>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(maybeEmitter0).isDisposed();
      AsyncHandler<AsyncHttpClientConfig.ResponseBodyPartFactory> asyncHandler0 = (AsyncHandler<AsyncHttpClientConfig.ResponseBodyPartFactory>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((AsyncHandler.State) null).when(asyncHandler0).onStatusReceived(any(org.asynchttpclient.HttpResponseStatus.class));
      MaybeAsyncHandlerBridge<Object> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<Object>(maybeEmitter0, asyncHandler0);
      maybeAsyncHandlerBridge0.onStatusReceived((HttpResponseStatus) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MaybeEmitter<ChronoLocalDate> maybeEmitter0 = (MaybeEmitter<ChronoLocalDate>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(maybeEmitter0).isDisposed();
      AsyncHandler<ChronoLocalDate> asyncHandler0 = (AsyncHandler<ChronoLocalDate>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      MaybeAsyncHandlerBridge<ChronoLocalDate> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<ChronoLocalDate>(maybeEmitter0, asyncHandler0);
      PooledByteBufAllocator pooledByteBufAllocator0 = new PooledByteBufAllocator(false);
      UnpooledDirectByteBuf unpooledDirectByteBuf0 = new UnpooledDirectByteBuf(pooledByteBufAllocator0, 0, 0);
      EagerResponseBodyPart eagerResponseBodyPart0 = new EagerResponseBodyPart(unpooledDirectByteBuf0, false);
      maybeAsyncHandlerBridge0.onBodyPartReceived(eagerResponseBodyPart0);
      maybeAsyncHandlerBridge0.onCompleted();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MaybeEmitter<ChannelOutboundHandlerAdapter> maybeEmitter0 = (MaybeEmitter<ChannelOutboundHandlerAdapter>) mock(MaybeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(maybeEmitter0).isDisposed();
      AsyncHandler<ChannelOutboundHandlerAdapter> asyncHandler0 = (AsyncHandler<ChannelOutboundHandlerAdapter>) mock(AsyncHandler.class, new ViolatedAssumptionAnswer());
      doReturn((AsyncHandler.State) null).when(asyncHandler0).onBodyPartReceived(any(org.asynchttpclient.HttpResponseBodyPart.class));
      MaybeAsyncHandlerBridge<ChannelOutboundHandlerAdapter> maybeAsyncHandlerBridge0 = new MaybeAsyncHandlerBridge<ChannelOutboundHandlerAdapter>(maybeEmitter0, asyncHandler0);
      maybeAsyncHandlerBridge0.onBodyPartReceived((HttpResponseBodyPart) null);
  }
}
