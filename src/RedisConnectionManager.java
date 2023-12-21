import redis.clients.jedis.Jedis;

public class RedisConnectionManager {
    private static final String REDIS_HOST = "localhost";
    private static final int REDIS_PORT = 6379;

    private Jedis jedis;

    public RedisConnectionManager() {
        this.jedis = new Jedis(REDIS_HOST, REDIS_PORT);
    }

    public Jedis getJedis() {
        return jedis;
    }

    public void close() {
        jedis.close();
    }
}
