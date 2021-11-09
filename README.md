# Mudi: Spring Web MVC
> ⚠️ Status: Developing.

## 📋 Business rules

Product sales site, where user A can register products and user B can set a price for that product in order to close a deal. Other important technical points:
- Authentication with Spring Security. 
- Graphical interface using Bootstrap and VueJS, for comparative effect.


INSERT INTO public.pedido(
	status, descricao, nome_produto, url_imagem, url_produto)
	VALUES ('AGUARDANDO','Mi Tv Stick Android Xiaomi O Xiaomi Mi TV Stick é um pequeno dispositivo do tamanho de um usb, com uma porta hdmi que se conecta à sua tv, para lhe dar acesso completo à Android tv. ', 'Mi Tv Stick Android Xiaomi','https://images-americanas.b2w.io/produtos/3483023601/imagens/mi-tv-stick-android-xiaomi-original-com-garantia-xiaomi-oficial/3483023610_1_xlarge.jpg', 'https://www.americanas.com.br/produto/3483023601?pfm_carac=Produtos%20Patrocinados&pfm_index=2&pfm_page=product&pfm_pos=product.1&pfm_type=vit_spacey&api=b2wads&chave=b2wads_6151e26b0bab3f0017d3b07f_40952461000189_3483023601_52dc64d6-88f8-459c-9b83-850e227125c1&sellerId=40952461000189&sellerName=F%20P%20S%20ELETRONICOS&pos=3&offerId=612e414e09c351890dd7571e&cor=Preto');
	
INSERT INTO public.pedido(
	status, descricao, nome_produto, url_imagem, url_produto)
	VALUES ('APROVADO','Um mundo sem plástico é um mundo melhor! Vamos começar por algo mais fácil! Adote uma caneca, seja branca personalizada qual for o importante é começar a pensar de forma sustentável!','Caneca Temática Ps4', 'https://images-americanas.b2w.io/produtos/2752821101/imagens/caneca-ps4-controle-joystick-video-game-gamer-geek/2752821119_1_xlarge.jpg','https://www.americanas.com.br/produto/2752821101?pfm_carac=caneca-gamer&pfm_page=search&pfm_pos=grid&pfm_type=search_page&offerId=5ffcd3400c07044266e44379&tamanho=8%20x%209%2C5%20cm&voltagem=N%C3%A3o');

INSERT INTO public.pedido(
	status, descricao, nome_produto, url_imagem, url_produto)
	VALUES ('ENTREGUE','Esta Cadeira Gamer foi desenvolvida especialmente para criar a aparência e estilo de uma arena de batalhas, com tática de jogadores superiores, um setup de respeito.','Cadeira Gamer Office Giratória ','https://images-americanas.b2w.io/produtos/52088333/imagens/cadeira-gamer-office-giratoria-com-elevacao-a-gas-tgc12-h01-preto-thunderx3/52088330_1_xlarge.jpg','https://www.americanas.com.br/produto/52088333?pfm_carac=Quem%20buscou%20os%20mesmos%20itens%20que%20voc%C3%AA%2C%20tamb%C3%A9m%20viu%3A&pfm_index=1&pfm_page=home&pfm_pos=home_page.rr4&pfm_type=vit_recommendation&DCSext.recom=RR_home_page.rr4-MultiSolrRecentSearchToPurchase&nm_origem=rec_home_page.rr4-MultiSolrRecentSearchToPurchase&nm_ranking_rec=2&offerId=618430a5d9fd6edeec6acffc&cor=Preto');
