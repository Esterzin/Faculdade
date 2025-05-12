ano_atual= int(input("Em que ano estamos: "))
ano_nascimento= int(input("Qual o ano do seu nascimento: "))

idade= ano_atual - ano_nascimento

if idade < 16:
     print("você não pode votar.")
elif 16 <= idade < 18 or idade > 65:
    print("voto facultativo")
else:
    print("você é obrigado a votar")