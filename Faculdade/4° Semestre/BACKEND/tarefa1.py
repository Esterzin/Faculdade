from datetime import datetime
class Aluno:
    def __init__(self, nome, data_nascimento, telefone, curso):
        self.nome = nome
        self.data_nascimento = datetime.strptime(data_nascimento, "%d/%m/%Y")
        self.telefone = telefone
        self.curso = curso
        self.disciplinas = {}

    def calcular_idade(self):
        hoje = datetime.today()
        idade = hoje.year - self.data_nascimento.year - (
                    (hoje.month, hoje.day) < (self.data_nascimento.month, self.data_nascimento.day))
        return idade

    def adicionar_disciplina(self, disciplina):
        if disciplina not in self.disciplinas:
            self.disciplinas[disciplina] = "Matriculado"
        else:
            print(f"O aluno já está matriculado na disciplina {disciplina}.")

    def alterar_situacao_disciplina(self, disciplina, situacao):
        if disciplina in self.disciplinas:
            if situacao in ["Matriculado", "Cancelado", "Aprovado", "Reprovado"]:
                self.disciplinas[disciplina] = situacao
            else:
                print("Situação inválida. Escolha entre: Matriculado, Cancelado, Aprovado ou Reprovado.")
        else:
            print(f"O aluno não está matriculado na disciplina {disciplina}.")

    def obter_informacoes(self):
        info = f"""
        Nome: {self.nome}
        Idade: {self.calcular_idade()} anos
        Telefone: {self.telefone}
        Curso: {self.curso}
        Disciplinas: {self.disciplinas}
        """
        return info.strip()

# Exemplo de uso da classe
aluno1 = Aluno("Ester", "18/12/2001", "11999999999", "Engenharia de Software")
print(aluno1.obter_informacoes())

aluno1.adicionar_disciplina("Matemática")
aluno1.adicionar_disciplina("Programação")
print(aluno1.obter_informacoes())

aluno1.alterar_situacao_disciplina("Matemática", "Aprovado")
aluno1.alterar_situacao_disciplina("Programação", "Reprovado")
print(aluno1.obter_informacoes())


