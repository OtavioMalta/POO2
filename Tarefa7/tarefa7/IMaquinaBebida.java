public interface IMaquinaBebida{//AbstractFactory
    IRefrigerante entregarRefrigerante();
    ISuco entregarSuco();
    IAgua entregarAgua();
    IRefrigerante entregarRefrigeranteZero();
}