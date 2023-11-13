# CodesHelp

CodesHelp, yazılım geliştiricilerin bir araya gelip birbirlerine yardımcı olduğu bir platformdur. Bu platform, yazılımcıların birbirleriyle iletişim kurmasını, sorular sormasını ve cevaplamasını, arkadaşlar eklemesini ve konu bazlı sohbet grupları oluşturmasını sağlar.

## Özellikler (Geliştiriliyor)

- **Anlık Mesajlaşma:** Kullanıcılar, gruplar oluşturabilir ve bu gruplar içinde anlık iletişim kurabilir.
- **Arkadaş Ekleme:** Kullanıcılar, diğer kullanıcıları arkadaş listelerine ekleyebilir ve bu kişilerle özel mesajlaşabilir.
- **Soru Paylaşma ve Yorum Yapma:** Kullanıcılar, sorularını paylaşabilir, diğer kullanıcılar da bu soruları yanıtlayabilir.

## Kullanım (Geliştiriliyor)

- Kullanıcılar için kayıt olma ve giriş yapma işlemleri vardır.
- Ana sayfa, kullanıcının arkadaşlarının etkinliklerini ve grup sohbetlerini görüntülemesini sağlar.
- Gruplar oluşturulabilir ve bu gruplar altında konu bazlı sohbetler gerçekleştirilebilir.

## Geliştirme Adımları

Bu platform, React, Java ve Cassandra veritabanı kullanılarak geliştirilmiştir. Katkıda bulunmak için aşağıdaki adımları takip edebilirsiniz:

### Projeyi Klonlama

1. Bu projenin GitHub deposunu klonlayın.

### Gereksinimlerin Yüklenmesi

2. Proje dizinine gidin ve gereksinimlerinizi yüklemek için aşağıdaki komutları çalıştırın:
    - React için: `npm install`
    - Java için: Maven kullanarak gerekli bağımlılıkları yükleyin.

### Cassandra'nın Başlatılması

3. Docker Compose kullanarak Cassandra veritabanını başlatmak için aşağıdaki adımları izleyin:
    - `docker-compose.yml` dosyasını projenizin ana dizinine ekleyin.
    - Terminalde projenizin ana dizinine gidin.
    - `docker-compose up` komutunu çalıştırarak Cassandra'yı başlatın.

4. Projeyi çalıştırmak için aşağıdaki adımları izleyin:
    - React uygulamanızı başlatmak için terminalde `npm start` komutunu çalıştırın.
    - Java uygulamanızı çalıştırmak için uygun komutları kullanın. (CoreApplication.java sınıfında main methodu mevcut)

### Tarayıcıda Görüntüleme

5. Projeyi gözlemlemek için tarayıcınızda [http://localhost:3000](http://localhost:3000) adresine gidin.

