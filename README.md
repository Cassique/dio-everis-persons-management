# Implementação projeto personsapi, agora a pessoa possui além de telefones, cursos e idiomas. 



### 3.1) Para gravar e buscar todos:
```bash
http://localhost:8080/api/v1/people 
```
### 3.2) Deploy no Heroku:
```bash
https://dio-everis-bootcamp.herokuapp.com/api/v1/people ` 
```

## 4) Para salvar:

```{
	"firstName" : "Geny",
	"lastName" : "oliver",
	"cpf" : "   .   .   -  ",
	"birthDate" : "1978-11-11",
  "phones" : [
		{
			"type" : "MOBILE",
			"number" : "(11)987654345" 
		}
	],
	 "courses" : [
		{
			"type" : "CERTIFICATION",
			"name" : "Microservice",
			"workLoad" : "10",
			"educationInstitute" : "DIO"
		}
			],
 "languages" : [
		{
			"level" : "ADVANCED",
			"language" : "English"
		}
	]
	}


```






