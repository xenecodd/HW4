**Unit Test Nedir?**
Unit test, genellikle fonksiyonları ve metodları test etmek için kullanılan bir yazılım geliştirme pratiğidir. Bu pratiğin amacı yazılımın kalitesini artırmaktır.

**Unit Test Kullanma Nedenleri**
Unit testlerin kullanılma nedenleri şunlar olabilir:
1. Kod hatalarını hızla tespit eder ve hata ayıklama sürecini hızlandırır.
2. Kodun değiştirilmesi sırasında meydana gelebilecek yan etkileri önler ve böylece kodun gelecekteki değişikliklere daha hızlı uyum sağlamasına yardımcı olur.
3. Kodun sürekli çalışır durumda olup olmadığını kontrol eder.
4. Gelecekteki geliştiricilere kodun nasıl kullanılacağına dair bilgi sağlar.

**Unit Test Frameworkleri**
Unit testler için kullanılan bazı popüler framework'ler şunlardır:
1. JUnit: Java projeleri için.
2. NUnit: .NET platformları için.
3. PyTest: Python projeleri için.
4. RSpec: Ruby projeleri için.
5. Mocha: JavaScript projeleri için.
6. PHPUnit: PHP projeleri için.
7. Golang Testing: Go projeleri için.
8. CppUnit: C++ projeleri için.

**Unit Test İçin Uyulması Gereken Kurallar**
Unit testler aşağıdaki kurallara uygun olmalıdır:
- Her test izole edilmiş, tekrarlanabilir, basit, anlaşılır ve net olmalıdır.
- Testler sürekli güncellenmeli ve hızlı çalışmalıdır.
- Her test bağımsız olmalıdır.
- Mümkünse tüm kod parçaları ayrı ayrı test edilmelidir.


2- Design pattern nedir?
*Tasarım kalıpları, yazılım geliştiricilerin yazılım geliştirme sırasında karşılaştıkları
genel sorunların çözümüdür. Bu çözümler, uzun bir süre boyunca sayısız yazılım geliştirici 
tarafından deneme yanılma yoluyla elde edilmiştir. Daha sonra belli problemler için buldukları 
optimum çözümlere isimler vermişlerdir.*

Örnek1:Singleton Design Pattern , Creational Design Pattern grubunda yer alır.

Singleton desgin pattern çalışma zamanında yalnızca 1 object yaratılmasını garanti eden tasarım desenidir.

Kullanımına ihtiyaç duyulan durum şudur :

Birden çok sınıfın aynı instance’ı kullanması gerekmektedir.
Tüm uygulama için yalnızca bir nesne olması gerekmektedir.
Sadece bir nesne olduğu (unique) garanti edilmelidir.
Bu gereklilikler için bir sınıf yaratırız ve sınıfın kendi instance’ını yönetmesini sağlarız.


Örnek2:Factory Design Pattern, nesne yaratma işlemi için bir 
arayüz tasarlanmasını gerektirir ve alt sınıfların nesne 
üretmesine olanak sağlar. Ayrıca, hangi sınıf nesnesinin 
oluşacağını da alt sınıflar kendileri belirler. 
Böylece nesne yaratma işlemini soyutlaştırır.