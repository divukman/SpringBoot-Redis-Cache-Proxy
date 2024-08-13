# Getting Started

Spring boot application that serves as a proxy towards outside api.
Outside api responses are cached into redis cache and returned.

## Run Redis locally
```
docker run --name redis -p 6379:6379 -d redis
```

## Redis client
https://redis.io/insight/#insight-form
```
snap install redisinsight
```

## Curl commands
``` 
curl --location --request GET 'http://localhost:8080/api/1'
curl --location --request GET 'http://localhost:8080/api/2'
curl --location --request GET 'http://localhost:8080/api/3'
```