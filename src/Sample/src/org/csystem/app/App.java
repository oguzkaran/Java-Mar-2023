/*-----------------------------------------------------------------------------------------------------------------------
	Closeable Arayüzü ve Try With Resources Statement: Bazı kaynaklar (resources) kullanılmaya başlamadan önce bir takım
	ilk işlemlerin yapılması gerekebilir. Bu işl işlemlerin yapılmasına mantıksal olarak "kaynağı açmak (open a resource)"
	diyelim. Örneğin, bir resim dosyasının boyutlarını dosya içerisindeki verilerden almak isteyen bir program bu dosyayı
	açmalıdır. Bu tip kaynakların kullanımı bittikten sonra da mantıksal olarak kapatılması yani kullanılan kaynağın
	serbest bırakılması (release) gerekir. Hatta bu tip bazı kaynaklar yalnızca bir akış tarafından kullanılabilir. Aynı
	anda birden fazla açılmaz. Bu durumda bu kaynakları kapatmak da daha kritik bir öneme sahiptir. İşte bu tarz kaynakları
	kullanan sınıflar Java'da Closeable arayüzünü desteklerler. Dolayısıyla Java dünyasında Closeable arayüzünü destekleyen
	bir sınıf yukarıdaki duruma benzer kaynakları kullanıyordur ve işlem bittiğinde bu kaynağın kapatılması gerekiyordur
	anlaşılır. Closeable arayüzünün aşağıdaki protoipe sahip abstract bir close metodu vardır:

		void close() throws IOException;

	İlgili sınıf kaynağın mantıksal kapatılmasını yani ilgili kaynağın geri bırakılmasını bu metotta implemente eder.
	Benzer şekilde yukarıdaki duruma benzer kaynak kullanan bir sınıf yazan programcı da bir contract/convention olarak
	Closeable arayüzünü destekler ve kaynağı geri bırakma işlemini close metodunda yapar. Şüphesiz kaynağı kullanan
	nesne yok edildiğinde kullandığı kaynak da geri bırakılır. Anca GC'nin ne zaman devreye belirsiz olduğundan kaynağın
	nesnenin yok edilmesinden close edilmesi gerekebilir. Bu tarz kaynak kullanan sınıfları kaynağı mantık açma işlemini
	genel olarak ctor'da yaparlar.
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

class App {
	public static void main(String [] args) throws IOException
	{

	}
}

class SensorInfo implements Closeable {
	private String m_name;
	private String m_host;
	private int m_port;
	private boolean m_open;

	//...

	public SensorInfo(String name, String host, int port) throws IOException
	{
		Random r = new Random();

		if (r.nextBoolean())
			throw new IOException("Problem occured while opening!...");

		m_name = name;
		m_host = host;
		m_port = port;
		m_open = true;
		System.out.printf("%s sensor at %s:%d open!...%n", m_name, m_host, m_port);
	}

	public int read(byte [] data) throws IOException
	{
		Random random = new Random();

		if (random.nextBoolean())
			throw new IOException("Read problem occurred!...");

		//...
		System.out.printf("Read from %s sensor at %s:%d!...%n", m_name, m_host, m_port);

		return data.length;
	}

	public void close() throws IOException
	{
		if (m_open)
			System.out.printf("%s sensor at %s:%d closed!...%n", m_name, m_host, m_port);
		else
			System.out.print("Sensor connection already closed!...");
	}

}