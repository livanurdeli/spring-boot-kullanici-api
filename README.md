Kullanıcı Yönetim Sistemi (Spring Boot API)
Bu proje; Java 21, Spring Boot 3 ve PostgreSQL kullanılarak geliştirilmiş, modern yazılım mimarisi prensiplerine uygun bir RESTful API uygulamasıdır. Kullanıcı verilerini güvenli ve performanslı bir şekilde yönetmek için tasarlanmıştır.

🔗 Proje Durumu & Demo
Backend Status: Active ✅

Database: PostgreSQL 

API Documentation: Postman

🚀 Proje Özellikleri 
Sistem, bir kurumsal uygulamanın ihtiyaç duyabileceği temel kullanıcı operasyonlarını kapsamaktadır:

Tam CRUD Desteği: Kullanıcı ekleme, güncelleme, silme ve ID tabanlı sorgulama.

Katmanlı Mimari (Layered Architecture): Controller, Service, Repository ve DTO katmanları ile kodun sürdürülebilirliği sağlanmıştır.

Veri Doğrulama (Validation): @Valid annotasyonları ile boş veri girişi veya hatalı format engellenmiştir.

Hata Yönetimi (Global Exception Handling): Kullanıcı bulunamadığında veya hatalı istek yapıldığında anlamlı JSON hata mesajları döner.

Veritabanı Entegrasyonu: PostgreSQL ile kalıcı veri saklama.

🛠️ Kullanılan Teknolojiler & Araçlar
Bu proje, sektörde en çok talep edilen modern teknoloji yığını ile geliştirilmiştir:

Java 21: En güncel uzun süreli destek (LTS) sürümü.

Spring Boot 3.x: Hızlı ve konfigürasyon gerektirmeyen uygulama geliştirme.

Spring Data JPA: Veritabanı işlemleri için soyutlama katmanı.

PostgreSQL: Güçlü ve ilişkisel veritabanı yönetimi.

Maven: Bağımlılık yönetimi ve proje yapılandırma.

Lombok: Boilerplate (gereksiz) kodu azaltmak için kullanıldı.

⚙️ Kurulum ve Yerel ÇalıştırmaProjeyi kendi bilgisayarınızda ayağa kaldırmak için şu adımları izleyebilirsiniz:

Repoyu Klonlayın:git clone https://github.com/livanurdeli/spring-boot-kullanici-api.git

Veritabanını Hazırlayın:PostgreSQL üzerinde testdb adında bir veritabanı oluşturun.

Ayarları Yapılandırın:src/main/resources/application.properties dosyasındaki username ve password alanlarını kendi yerel bilgilerinizle güncelleyin.

Uygulamayı Çalıştırın:Terminal üzerinden proje ana dizinine giderek şu komutu çalıştırın:mvn spring-boot:run

### 📸 API Test Çıktısı 
<img width="1023" height="564" alt="image" src="https://github.com/user-attachments/assets/c1c80794-97c7-45aa-ae33-183e781cb0f6" />
