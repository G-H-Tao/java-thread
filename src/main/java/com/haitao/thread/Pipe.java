package com.haitao.thread;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * �ܵ�ͨ��
 * @author Tao-pc
 *
 *	�߳�ReaderThread��ʼִ�У�
	�߳�ReaderThreadʹ�ùܵ�reader.read()���롱��������
	�߳�WriterThread��ʼִ�У�
	�߳�WriterThread��writer.write("test")���ܵ�д���ַ�����
	�߳�WriterThreadʹ��writer.close()�����ܵ�д�룬��ִ����ϣ�
	�߳�ReaderThread���ܵ��ܵ�������ַ�������ӡ��
	�߳�ReaderThreadִ����ϡ�
 */
public class Pipe {
	
	static class ReaderThread implements Runnable{
		
		private PipedReader reader;
		
		public ReaderThread(PipedReader reader) {
			this.reader = reader;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("this is reader");
			int receive = 0;
			try {
				while ((receive = reader.read()) != -1) {
					System.out.println((char)receive);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	static class WriterThread implements Runnable{
		private PipedWriter writer;
		
		public WriterThread(PipedWriter writer) {
			this.writer = writer;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("this is writer");
            int receive = 0;
            try {
                writer.write("test");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();
        writer.connect(reader); // ����ע��һ��Ҫ���ӣ�����ͨ��

        new Thread(new ReaderThread(reader)).start();
        Thread.sleep(1000);
        new Thread(new WriterThread(writer)).start();
	}

}
