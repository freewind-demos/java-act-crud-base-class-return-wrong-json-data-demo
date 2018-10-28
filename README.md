Java Act CRUD Base Class Issue Demo
===================================

```
./run_dev
```

Will show errors:

```
2018-10-28 12:30:55,732 INFO  a.a.App@[Thread-2] - App shutting down ....
Exception in thread "main" java.lang.NullPointerException
	at act.app.AppCompiler$4.acceptResult(AppCompiler.java:285)
	at org.eclipse.jdt.internal.compiler.Compiler.processCompiledUnits(Compiler.java:563)
	at org.eclipse.jdt.internal.compiler.Compiler.compile(Compiler.java:462)
	at org.eclipse.jdt.internal.compiler.Compiler.compile(Compiler.java:417)
	at act.app.AppCompiler.compile(AppCompiler.java:116)
	at act.app.DevModeClassLoader.compileSources(DevModeClassLoader.java:171)
	at act.app.DevModeClassLoader.scan(DevModeClassLoader.java:103)
	at act.app.App.scanAppCodes(App.java:1532)
	at act.app.App.refresh(App.java:660)
	at act.app.AppManager.load(AppManager.java:77)
	at act.app.AppManager$_F$1.visit(AppManager.java:145)
	at act.app.AppManager$_F$1.visit(AppManager.java:141)
	at org.osgl.Lang$Visitor.apply(Lang.java:2459)
	at org.osgl.Lang$Visitor.apply(Lang.java:2449)
	at act.app.AppScanner.scan(AppScanner.java:91)
	at act.app.AppScanner.scan(AppScanner.java:71)
	at act.app.AppManager.loadSingleApp(AppManager.java:55)
	at act.Act.startup(Act.java:314)
	at act.Act.startup(Act.java:1094)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.osgl.Lang.invokeStatic(Lang.java:7742)
	at act.Act.bootstrap(Act.java:1000)
	at act.Act.start(Act.java:621)
	at com.mycom.helloworld.AppEntry.main(AppEntry.java:11)
sub process returned with exit code: 1
```