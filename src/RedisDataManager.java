import redis.clients.jedis.Jedis;

public class RedisDataManager {
    private RedisConnectionManager connectionManager;

    public RedisDataManager(RedisConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    public void set(String key, String value) {
        try (Jedis jedis = connectionManager.getJedis()) {
            jedis.set(key, value);
        }
    }

    public String get(String key) {
        try (Jedis jedis = connectionManager.getJedis()) {
            return jedis.get(key);
        }
    }

    public void delete(String key) {
        try (Jedis jedis = connectionManager.getJedis()) {
            jedis.del(key);
        }
    }
}
