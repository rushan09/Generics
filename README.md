# Generics
Following Pluralsight Java Generics


################################
This repository covers basics of java generics, Unit test, Exceptions and creating custom exceptions.

-----------------------------------------

####Example annotaions in unit test
```
@BeforClass
@Before
@Test
@After
@Before
@Test
@After
@AfterClass
```

#####Few more annotations

```
@Test(timeout=10)
//Thread.sleep(10000)

@Ignore
@Test

@Test(expected = anyexception.class)
public void exTest() throws anyexception
{
  //Code goes here
}

//This test will pass if we get an exception
@Rule
public ExpectedException ex = ExpectedException.none();
@Test
public void exTest() throws anyexception
{
  ex.expect(anyexception.class);
  ex.expectMessage("What weexpect")
}

```
#####We can use try catch in Junit testing
```
@Rule
```

