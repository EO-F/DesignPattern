package 经典Builder模式;

public interface ComputerConfigBuilder {
    void setCPU();
    void setMemery();
    void setHardDisk();
    void setKeyboard();
    void setMouse();
    Computer getComputer();
}