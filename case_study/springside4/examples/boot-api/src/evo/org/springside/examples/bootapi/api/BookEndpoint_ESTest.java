/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 18:12:46 GMT 2017
 */

package org.springside.examples.bootapi.api;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Pageable;
import org.springside.examples.bootapi.api.BookEndpoint;
import org.springside.examples.bootapi.domain.Account;
import org.springside.examples.bootapi.domain.Book;
import org.springside.examples.bootapi.dto.BookDto;
import org.springside.examples.bootapi.service.AccountService;
import org.springside.examples.bootapi.service.BookAdminService;
import org.springside.examples.bootapi.service.BookBorrowService;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BookEndpoint_ESTest extends BookEndpoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn((Account) null).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long((-1L));
      bookEndpoint0.markBookReturned(long0, ".class");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      doReturn((Book) null).when(bookAdminService0).findOne(anyLong());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long(0L);
      BookDto bookDto0 = bookEndpoint0.listOneBook(long0);
      assertNull(bookDto0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      doReturn((Iterable) null).when(bookAdminService0).findAll(any(org.springframework.data.domain.Pageable.class));
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Pageable pageable0 = mock(Pageable.class, new ViolatedAssumptionAnswer());
      List<BookDto> list0 = bookEndpoint0.listAllBook(pageable0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long(4264L);
      // Undeclared exception!
      try { 
        bookEndpoint0.rejectBorrowRequest(long0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      // Undeclared exception!
      try { 
        bookEndpoint0.modifyBook((BookDto) null, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn((Account) null).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      // Undeclared exception!
      try { 
        bookEndpoint0.modifyBook((BookDto) null, "No token in request");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long(2510L);
      // Undeclared exception!
      try { 
        bookEndpoint0.markBookBorrowed(long0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Pageable pageable0 = mock(Pageable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        bookEndpoint0.listMyBorrowedBook((String) null, pageable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn((Account) null).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Pageable pageable0 = mock(Pageable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        bookEndpoint0.listMyBorrowedBook("%s.addAll(asList(%s));", pageable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Pageable pageable0 = mock(Pageable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        bookEndpoint0.listMyBook((String) null, pageable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn((Account) null).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Pageable pageable0 = mock(Pageable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        bookEndpoint0.listMyBook(":Oso8kO", pageable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      Iterable<Book> iterable0 = (Iterable<Book>) mock(Iterable.class, new ViolatedAssumptionAnswer());
      doReturn((Iterator) null).when(iterable0).iterator();
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      doReturn(iterable0).when(bookAdminService0).findAll(any(org.springframework.data.domain.Pageable.class));
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Pageable pageable0 = mock(Pageable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        bookEndpoint0.listAllBook(pageable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ma.glasnost.orika.impl.MapperFacadeImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long(2259L);
      // Undeclared exception!
      try { 
        bookEndpoint0.deleteBook(long0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn((Account) null).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long((-32768L));
      // Undeclared exception!
      try { 
        bookEndpoint0.deleteBook(long0, "lh&U4<K,\" r=:HNy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      Book book0 = mock(Book.class, new ViolatedAssumptionAnswer());
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      doReturn(book0).when(bookAdminService0).findOne(anyLong());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long(32767L);
      BookDto bookDto0 = bookEndpoint0.listOneBook(long0);
      // Undeclared exception!
      try { 
        bookEndpoint0.createBook(bookDto0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long(547L);
      // Undeclared exception!
      try { 
        bookEndpoint0.cancelBorrowRequest(long0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        bookEndpoint0.applyBorrowRequest(long0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      Iterator<Book> iterator0 = (Iterator<Book>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      Iterable<Book> iterable0 = (Iterable<Book>) mock(Iterable.class, new ViolatedAssumptionAnswer());
      doReturn(iterator0).when(iterable0).iterator();
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      doReturn(iterable0).when(bookAdminService0).findAll(any(org.springframework.data.domain.Pageable.class));
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Pageable pageable0 = mock(Pageable.class, new ViolatedAssumptionAnswer());
      List<BookDto> list0 = bookEndpoint0.listAllBook(pageable0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      // Undeclared exception!
      try { 
        bookEndpoint0.markBookReturned((Long) null, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No token in request
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      Account account0 = mock(Account.class, new ViolatedAssumptionAnswer());
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn(account0).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long(0L);
      bookEndpoint0.markBookBorrowed(long0, "No token in request");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      Account account0 = mock(Account.class, new ViolatedAssumptionAnswer());
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn(account0).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long((-1L));
      bookEndpoint0.deleteBook(long0, "+A$ME,=6k'+g$s<l#ys");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      Account account0 = mock(Account.class, new ViolatedAssumptionAnswer());
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn(account0).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(bookAdminService0).listMyBook(anyLong() , any(org.springframework.data.domain.Pageable.class));
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      List<BookDto> list0 = bookEndpoint0.listMyBook(";6!x", (Pageable) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      Account account0 = mock(Account.class, new ViolatedAssumptionAnswer());
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn(account0).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      bookEndpoint0.cancelBorrowRequest((Long) null, "");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      Account account0 = mock(Account.class, new ViolatedAssumptionAnswer());
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn(account0).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(bookBorrowService0).listMyBorrowedBook(anyLong() , any(org.springframework.data.domain.Pageable.class));
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Pageable pageable0 = mock(Pageable.class, new ViolatedAssumptionAnswer());
      List<BookDto> list0 = bookEndpoint0.listMyBorrowedBook("", pageable0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn((Account) null).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long((-1L));
      bookEndpoint0.rejectBorrowRequest(long0, ".class");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      Account account0 = mock(Account.class, new ViolatedAssumptionAnswer());
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn(account0).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long((-4052L));
      bookEndpoint0.applyBorrowRequest(long0, "");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      Account account0 = mock(Account.class, new ViolatedAssumptionAnswer());
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn((Account) null).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      Book book0 = mock(Book.class, new ViolatedAssumptionAnswer());
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      doReturn(book0).when(bookAdminService0).findOne(anyLong());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      Long long0 = new Long((-1L));
      BookDto bookDto0 = bookEndpoint0.listOneBook(long0);
      // Undeclared exception!
      try { 
        bookEndpoint0.modifyBook(bookDto0, "org.springside.examples.bootapi.api.BookEndpoint");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springside.examples.bootapi.api.BookEndpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BookEndpoint bookEndpoint0 = new BookEndpoint();
      Account account0 = mock(Account.class, new ViolatedAssumptionAnswer());
      AccountService accountService0 = mock(AccountService.class, new ViolatedAssumptionAnswer());
      doReturn((Account) null).when(accountService0).getLoginUser(anyString());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "accountService", (Object) accountService0);
      BookAdminService bookAdminService0 = mock(BookAdminService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "adminService", (Object) bookAdminService0);
      BookBorrowService bookBorrowService0 = mock(BookBorrowService.class, new ViolatedAssumptionAnswer());
      Injector.inject(bookEndpoint0, (Class<?>) BookEndpoint.class, "borrowService", (Object) bookBorrowService0);
      Injector.validateBean(bookEndpoint0, (Class<?>) BookEndpoint.class);
      bookEndpoint0.createBook((BookDto) null, "");
  }
}