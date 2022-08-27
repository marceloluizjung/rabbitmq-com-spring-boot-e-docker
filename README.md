> Imagem RabbitMq: docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq:3-management
> Acessar o container pelo terminar: docker exec -it rabbitmq bash
> IntelliJ (plugin): Spring Assistant - Auxiliar no desenvolvimento
> Dependência utilizada: Spring for RabbitMQ
> Fluxo Rabbit: Publisher > Publish > Exchange > Routes > Queue > Consumes > Consumer
A mensagem é encaminhada pelo produtor, a msg é interceptada por uma exchange e a mesma encaminha a mensagem para uma fila, o roteamento da msg é descrito pelo próprio produtor.
> Deadletter: Serve para controle de erro, caso um serviço receba uma msg que da pau no meio do caminho, pra não se perder a msg ela cai na deadletter.
> Existem tipos de exchange, no curso a gente usou a DirectExchange
> Implementação desacoplada, sempre crie interfaces e dps vai implementando conforme escolhas, e não use dependências específicas, aumenta o acoplamento.

- Base:
- https://github.com/MrSpock182/rabbitmq-producer-springboot
- https://github.com/MrSpock182/rabbitmq-consumer-springboot