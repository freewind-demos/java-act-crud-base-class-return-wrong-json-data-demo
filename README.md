Java Act CRUD Base Class Return Wrong Json Data Demo
====================================================

```
./run_dev
```

Then:

```
brew install httpie
http http://localhost:5460/users
```

Will return invalid data:

```
HTTP/1.1 200 OK
Content-Length: 50
Content-Type: text/html
Date: Sun, 28 Oct 2018 07:33:10 GMT
Server: act/1.8.8-RC11

BeanList size[1] list[com.mycom.helloworld.User@1]
```
