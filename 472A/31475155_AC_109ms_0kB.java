import java.io.*;
import java.nio.charset.Charset;
public class Main {
  static boolean isCom(int num){
    if(num==1)
      return false;  
    else {
      int x=2; 
      boolean flag=true;
      while(x<num){ 
        if(num%x==0) {
          return true; 
        }
        x++; 
      } 
      return false;
    }
  }
  
  public static void main(String[] args) throws java.io.IOException{
    Charset charset=Charset.forName("ascii");
    FastIO sc=new FastIO(System.in,System.out,charset);
    int num=sc.readInt();
    int []ar={4,6,8,9,10,12,14};
    
    int sum=0;
    int x=0;
    int y=0;
    int idx=0;
    while(true){
      if(isCom(num-ar[idx])){
      x=ar[idx];
      y=num-ar[idx];
      break;
      }else
        idx++;
       }
    System.out.println(x+" "+y);
  }
}
class FastIO {
  public final StringBuilder cache = new StringBuilder(1 << 20);
  private final InputStream is;
  private final OutputStream os;
  private final Charset charset;
  private StringBuilder defaultStringBuf = new StringBuilder(1 << 8);
  private byte[] buf = new byte[1 << 13];
  private int bufLen;
  private int bufOffset;
  private int next;
  
  public FastIO(InputStream is, OutputStream os, Charset charset) {
    this.is = is;
    this.os = os;
    this.charset = charset;
  }
  
  public FastIO(InputStream is, OutputStream os) {
    this(is, os, Charset.forName("ascii"));
  }
  
  private int read() {
    while (bufLen == bufOffset) {
      bufOffset = 0;
      try {
        bufLen = is.read(buf);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      if (bufLen == -1) {
        return -1;
      }
    }
    return buf[bufOffset++];
  }
  
  public void skipBlank() {
    while (next >= 0 && next <= 32) {
      next = read();
    }
  }
  
  public int readInt() {
    int sign = 1;
    
    skipBlank();
    if (next == '+' || next == '-') {
      sign = next == '+' ? 1 : -1;
      next = read();
    }
    
    int val = 0;
    if (sign == 1) {
      while (next >= '0' && next <= '9') {
        val = val * 10 + next - '0';
        next = read();
      }
    } else {
      while (next >= '0' && next <= '9') {
        val = val * 10 - next + '0';
        next = read();
      }
    }
    
    return val;
  }
  
  public long readLong() {
    int sign = 1;
    
    skipBlank();
    if (next == '+' || next == '-') {
      sign = next == '+' ? 1 : -1;
      next = read();
    }
    
    long val = 0;
    if (sign == 1) {
      while (next >= '0' && next <= '9') {
        val = val * 10 + next - '0';
        next = read();
      }
    } else {
      while (next >= '0' && next <= '9') {
        val = val * 10 - next + '0';
        next = read();
      }
    }
    
    return val;
  }
  
  public double readDouble() {
    boolean sign = true;
    skipBlank();
    if (next == '+' || next == '-') {
      sign = next == '+';
      next = read();
    }
    
    long val = 0;
    while (next >= '0' && next <= '9') {
      val = val * 10 + next - '0';
      next = read();
    }
    if (next != '.') {
      return sign ? val : -val;
    }
    next = read();
    long radix = 1;
    long point = 0;
    while (next >= '0' && next <= '9') {
      point = point * 10 + next - '0';
      radix = radix * 10;
      next = read();
    }
    double result = val + (double) point / radix;
    return sign ? result : -result;
  }
  
  
  public int readLine(char[] data, int offset) {
    int originalOffset = offset;
    while (next != -1 && next != '\n') {
      data[offset++] = (char) next;
      next = read();
    }
    return offset - originalOffset;
  }
  
  public int readString(char[] data, int offset) {
    skipBlank();
    
    int originalOffset = offset;
    while (next > 32) {
      data[offset++] = (char) next;
      next = read();
    }
    
    return offset - originalOffset;
  }
  
  public int readString(byte[] data, int offset) {
    skipBlank();
    
    int originalOffset = offset;
    while (next > 32) {
      data[offset++] = (byte) next;
      next = read();
    }
    
    return offset - originalOffset;
  }
  
  public char readChar() {
    skipBlank();
    char c = (char) next;
    next = read();
    return c;
  }
  
  public void flush() {
    try {
      os.write(cache.toString().getBytes(charset));
      os.flush();
      cache.setLength(0);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  public boolean hasMore() {
    skipBlank();
    return next != -1;
  }
}