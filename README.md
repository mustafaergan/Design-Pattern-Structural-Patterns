# Yapısal Tasarım Desenleri (Java)

Yapısal (structural) tasarım desenlerinin Türkçe adlandırılmış basit Java örnekleri. Her desen kendi
klasöründe, kısa bir açıklama ve bir ya da iki örnekle anlatılır.

> **Not:** Bu depo 2018 yılında eğitim amaçlı yazıldı ve artık güncellenmiyor.

## İçerik

| Klasör | Desen | Örnek |
|---|---|---|
| `adapter` | Adapter | Doğru ve dikdörtgeni ortak bir `Sekil` arayüzüne uyarlama; priz ve voltaj adaptörü |
| `bridge` | Bridge | Şekil ile renk ayrımı; ürünler (TV, radyo) ile kumandalar arasındaki köprü |
| `composite` | Composite | Dosya ve dizinleri ortak bir arayüzle ağaç yapısında tutma |
| `decorator` | Decorator | Üye işlemine çalışma anında mesaj gönderme davranışı ekleme |
| `facade` | Facade | Kontrol ve operasyon alt sistemlerini tek bir sınıfın arkasına saklama |
| `flyweight` | Flyweight | Aynı anahtar nesnelerini fabrikada saklayıp yeniden kullanma |
| `proxy` | Proxy | Ödemeyi, önce giriş kontrolü yapan vekil banka sınıfı üzerinden yapma |

Bazı örneklerde `once` (desen uygulanmadan önce) ve `sonra` (desen uygulandıktan sonra) paketleri yan yana
durur. Her klasördeki `README.md` desenin kısa tanımını ve Java kütüphanesinde kullanıldığı yerleri içerir.
Çalıştırılacak sınıf her pakette `Islem.java`'dır.

## Teknolojiler

- Java (yalnızca standart kütüphane, dış bağımlılık yok)
- Maven ya da Gradle dosyası yok; her desen klasörünün kendi `src` klasörü vardır.

## Çalıştırma

IDE'de ilgili desenin `src` klasörünü kaynak klasörü olarak ekleyip `Islem` sınıfını çalıştırın ya da komut
satırından:

```bash
javac -encoding UTF-8 -sourcepath adapter/src -d out adapter/src/com/mustafaergan/ornek2/Islem.java
java -cp out com.mustafaergan.ornek2.Islem
```

Desenlerin hepsi `com.mustafaergan.ornek1` gibi aynı paket adlarını kullandığından, her deseni ayrı derleyin.
