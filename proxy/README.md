Var olan bir nesneye ulaşılmak istendiğinde vekil kalıp oluşturulur. Nesneyle istemci arasına yeni bir katman koyarak nesnenin kontrollü bir şekilde paylaşılması sağlanır.

Proxy pattern, kendisinden yeni bir örnek (instance) oluşturulduğunda, oluşturma ve/veya hafızada yer tutma maliyeti yüksek olan sınıfları (class), sadece o sınıf içindeki bir method çağrıldığında oluşturmak; böylece, sınıfın sisteme getireceği yükü azaltmak ve aynı method çağrıları için daha önce oluşturulmuş olan örnekleri (instance) kullanarak, bu şekilde performans artışı sağlamak amacı ile oluşturulmuş bir dersen (pattern) dir.


JAVA:

java.lang.reflect.Proxy

java.rmi.*

javax.ejb.EJB

javax.inject.Inject

javax.persistence.PersistenceContext