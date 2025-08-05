# Crie uma classe chamada ContaBancaria com um construtor que aceita os parâmetros titular e saldo. 
# Inicie o atributo ativo como False por padrão, adicione um método especial __str__ que retorna uma mensagem formatada com o titular e o saldo da conta. 
# Crie duas instâncias da classe e imprima essas instâncias. 
# Adicione um método de classe chamado ativar_conta à classe ContaBancaria que define o atributo ativo como True. 
# Crie uma instância da classe, chame o método de classe e imprima o valor de ativo. Refatore a classe ContaBancaria para utilizar a abordagem "pythonica" na criação de atributos. 

class ContaBancariaPythonica:
    def __init__(self, titular, saldo):
        self._titular = titular
        self._saldo = saldo
        self._ativo = False


    @property
    def titular(self):
        return self._titular


    @property
    def saldo(self):
        return self._saldo


    @property
    def ativo(self):
        return self._ativo
    

    def __str__(self):
        return f"Nome: {self.titular}\nSaldo: R$ {self.saldo}\n"
    

    @classmethod
    def ativar_conta(cls, conta):
        conta._ativo = True


p1 = ContaBancariaPythonica("Hederson", 1000)
p2 = ContaBancariaPythonica("Ana", 2000)

print(p1)
print(p2)

p3 = ContaBancariaPythonica("Carlos", 200)
print(f"{p3.titular} está ativo? {p3.ativo}")
ContaBancariaPythonica.ativar_conta(p3)
print(f"{p3.titular} está ativo? {p3.ativo}")
