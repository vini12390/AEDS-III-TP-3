import java.io.*;

public class Categoria implements Registro {

    public int id;
    public String nome;

    public Categoria() {
        this(-1, "");
    }
    public Categoria(String n) {
        this(-1, n);
    }

    public Categoria(int i, String n) {
        this.id = i;
        this.nome = n;
    }

    public int getIdCategoria(){
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "\nID..: " + this.id +
                "\nNome: " + this.nome;
    }

    public byte[] toByteArray() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeInt(this.id);
        dos.writeUTF(this.nome);
        return baos.toByteArray();
    }


    public void fromByteArray(byte[] b) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        DataInputStream dis = new DataInputStream(bais);
        this.id = dis.readInt();
        this.nome = dis.readUTF();
    }

}
