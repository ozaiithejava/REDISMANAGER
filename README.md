# REDISMANAGER
redis manager in java


## Usage:
```Java
public class Main {
    public static void main(String[] args) {
        // Redis bağlantısını yöneten sınıfı oluştur
        RedisConnectionManager connectionManager = new RedisConnectionManager();

        // Redis üzerinde veri işlemlerini yöneten sınıfı oluştur
        RedisDataManager dataManager = new RedisDataManager(connectionManager);

        // Veri ekleme
        dataManager.set("name", "John Doe");

        // Veriyi alma
        String name = dataManager.get("name");
        System.out.println("Name: " + name);

        // Veriyi silme
        dataManager.delete("name");

        // Redis bağlantısını kapat
        connectionManager.close();
    }
}
```
