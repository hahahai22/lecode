package jedis;

import redis.clients.jedis.Jedis;

/**
 * ����redis���ݿ������
 * ����ǰ�������redis�����
 */
public class RedisJava {
    public static void main(String[] args) {
        //���ӱ��ص� Redis ����
        Jedis jedis = new Jedis("localhost");
        // ��� Redis �������������룬��Ҫ�������У�û�оͲ���Ҫ
        // jedis.auth("123456"); 
        System.out.println("���ӳɹ�");
        //�鿴�����Ƿ�����
        System.out.println("������������: "+jedis.ping());
    }
}