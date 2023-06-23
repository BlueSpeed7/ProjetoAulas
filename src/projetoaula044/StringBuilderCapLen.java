// @author RA21600867
package projetoaula044;
public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?"), buffer2 = new StringBuilder("Pedro Alves"), buffer3 = new StringBuilder("Fernando Marinho de Souza Lopes");
        System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n", buffer.toString(), buffer.length(), buffer.capacity());
        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d\n", buffer.capacity());
        buffer.setLength(10);
        System.out.printf("New length = %d\nbuffer = %s\nNew capacity = %d\n", buffer.length(), buffer.toString(), buffer.capacity());
        System.out.printf("buffer2 = %s\nlength = %d\ncapacity = %d\n", buffer2.toString(), buffer2.length(), buffer2.capacity());
        buffer2.setLength(15);
        System.out.printf("buffer2 = %s\nNew length = %d\ncapacity = %d\n", buffer2.toString(), buffer2.length(), buffer2.capacity());
        buffer2.setLength(5);
        System.out.printf("buffer2 = %s\nNew length = %d\ncapacity = %d\n", buffer2.toString(), buffer2.length(), buffer2.capacity());
        buffer2.ensureCapacity(70);
        System.out.printf("buffer2 = %s\nlength = %d\nNew capacity = %d\n", buffer2.toString(), buffer2.length(), buffer2.capacity());
        buffer2.ensureCapacity(80);
        System.out.printf("buffer2 = %s\nlength = %d\nNew capacity = %d\n", buffer2.toString(), buffer2.length(), buffer2.capacity());
        buffer2.ensureCapacity(10);
        System.out.printf("buffer2 = %s\nlength = %d\nNew capacity = %d\n", buffer2.toString(), buffer2.length(), buffer2.capacity());
        System.out.printf("buffer3 = %s\nlength = %d\ncapacity = %d\n", buffer3, buffer3.length(), buffer3.capacity());
        buffer3.setLength(15);
        System.out.printf("buffer3 = %s\nNew length = %d\ncapacity = %d\n", buffer3, buffer3.length(), buffer3.capacity());
        buffer3.setLength(5);
        System.out.printf("buffer3 = %s\nNew length = %d\ncapacity = %d\n", buffer3, buffer3.length(), buffer3.capacity());
        buffer3.ensureCapacity(70);
        System.out.printf("buffer3 = %s\nlength = %d\nNew capacity = %d\n", buffer3, buffer3.length(), buffer3.capacity());
        buffer3.ensureCapacity(80);
        System.out.printf("buffer3 = %s\nlength = %d\nNew capacity = %d\n", buffer3, buffer3.length(), buffer3.capacity());
        buffer3.ensureCapacity(10);
        System.out.printf("buffer3 = %s\nlength = %d\nNew capacity = %d\n", buffer3, buffer3.length(), buffer3.capacity());
    }
}