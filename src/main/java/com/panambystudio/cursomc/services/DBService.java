package com.panambystudio.cursomc.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.panambystudio.cursomc.domain.Categoria;
import com.panambystudio.cursomc.domain.Cidade;
import com.panambystudio.cursomc.domain.Cliente;
import com.panambystudio.cursomc.domain.Endereco;
import com.panambystudio.cursomc.domain.Estado;
import com.panambystudio.cursomc.domain.ItemPedido;
import com.panambystudio.cursomc.domain.Pagamento;
import com.panambystudio.cursomc.domain.PagamentoComBoleto;
import com.panambystudio.cursomc.domain.PagamentoComCartao;
import com.panambystudio.cursomc.domain.Pedido;
import com.panambystudio.cursomc.domain.Produto;
import com.panambystudio.cursomc.enums.EstadoPagamento;
import com.panambystudio.cursomc.enums.Perfil;
import com.panambystudio.cursomc.enums.TipoCliente;
import com.panambystudio.cursomc.repositories.CategoriaRepository;
import com.panambystudio.cursomc.repositories.CidadeRepository;
import com.panambystudio.cursomc.repositories.ClienteRepository;
import com.panambystudio.cursomc.repositories.EnderecoRepository;
import com.panambystudio.cursomc.repositories.EstadoRepository;
import com.panambystudio.cursomc.repositories.ItemPedidoRepository;
import com.panambystudio.cursomc.repositories.PagamentoRepository;
import com.panambystudio.cursomc.repositories.PedidoRepository;
import com.panambystudio.cursomc.repositories.ProdutoRepository;

@Service
public class DBService {

	@Autowired
	private BCryptPasswordEncoder pe;
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private PagamentoRepository pagamentoRepository;

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	public void instantiateTestDatabase() throws ParseException {

		Categoria cat1 = new Categoria(null, "Barbeadores");
		Categoria cat2 = new Categoria(null, "Bálsamo, Óleos e Tônicos");
		Categoria cat3 = new Categoria(null, "Lâminas de Barbear");
		Categoria cat4 = new Categoria(null, "Kits de Barbear");
		Categoria cat5 = new Categoria(null, "Espumas de Babear");
		Categoria cat6 = new Categoria(null, "Produtos Pós Barbear");
		Categoria cat7 = new Categoria(null, "Pentes Alinhadores de Barba");

		Produto p1 = new Produto(null, "Aparelho para Barbear Sensecare Gillette Leve 4 Pague 3", 19.99);
		Produto p2 = new Produto(null, "Barbeador Gillette Mach3 Acqua-Grip", 14.99);
		Produto p3 = new Produto(null, "Barbeador Elétrico De Cabelo Vintage Dourado Oferta", 109.99);
		Produto p4 = new Produto(null, "Felpsmen Balm Bomba De Crescimento Barba E Cabelo Poker 240g", 59.99);
		Produto p5 = new Produto(null, "Kit Com 2 Lâminas De Barbear Philips Oneblade", 149.99);
		Produto p6 = new Produto(null, "Lâmina Wilkinson Barbear Aço 1 Cartela=60unidades", 29.99);
		Produto p7 = new Produto(null, "Kit Barba Vintage Retrô Barbearia Navalha Pincel Banheiro", 59.99);
		Produto p8 = new Produto(null, "Kit Para Barba Cabelo E Bigode + Brinde For Man Barba Home", 39.99);
		Produto p9 = new Produto(null, "Kit Para Barba Shampoo Balm Óleo Pomada, Colônia Perfume", 79.99);
		Produto p10 = new Produto(null, "Shaving Shave Shavim Refrescante Com Creme Incolor 500g Fox", 49.99);
		Produto p11 = new Produto(null, "Bálsamo Creme Pós-barba Bozzano Hidratação 100g", 19.99);
		Produto p12 = new Produto(null, "Barbeador Philips OneBlade QP2510 verde-lima e cinza-marengo 100V/240V", 129.99);
		Produto p13 = new Produto(null, "Barbeador Philips AquaTouch 1000 S1121 azul-malibú 100V/240V", 169.99);
		Produto p14 = new Produto(null, "Bálsamo Danger Barba Forte Óleo Hidratante Beard Balm - 170g", 29.99);
		Produto p15 = new Produto(null, "Óleo Para Barba Danger - Barba Forte - 30ml", 31.99);
		Produto p16 = new Produto(null, "Pente Barba Régua Modelador Alinhador Novo Formato", 24.99);
		Produto p17 = new Produto(null, "Molde Para Barba Pente Modelador Régua Aparador Bigode", 15.99);
		Produto p18 = new Produto(null, "Produto 18", 10.00);
		Produto p19 = new Produto(null, "Produto 19", 10.00);
		Produto p20 = new Produto(null, "Produto 20", 10.00);
		Produto p21 = new Produto(null, "Produto 21", 10.00);
		Produto p22 = new Produto(null, "Produto 22", 10.00);
		Produto p23 = new Produto(null, "Produto 23", 10.00);
		Produto p24 = new Produto(null, "Produto 24", 10.00);
		Produto p25 = new Produto(null, "Produto 25", 10.00);
		Produto p26 = new Produto(null, "Produto 26", 10.00);
		Produto p27 = new Produto(null, "Produto 27", 10.00);
		Produto p28 = new Produto(null, "Produto 28", 10.00);
		Produto p29 = new Produto(null, "Produto 29", 10.00);
		Produto p30 = new Produto(null, "Produto 30", 10.00);
		Produto p31 = new Produto(null, "Produto 31", 10.00);
		Produto p32 = new Produto(null, "Produto 32", 10.00);
		Produto p33 = new Produto(null, "Produto 33", 10.00);
		Produto p34 = new Produto(null, "Produto 34", 10.00);
		Produto p35 = new Produto(null, "Produto 35", 10.00);
		Produto p36 = new Produto(null, "Produto 36", 10.00);
		Produto p37 = new Produto(null, "Produto 37", 10.00);
		Produto p38 = new Produto(null, "Produto 38", 10.00);
		Produto p39 = new Produto(null, "Produto 39", 10.00);
		Produto p40 = new Produto(null, "Produto 40", 10.00);
		Produto p41 = new Produto(null, "Produto 41", 10.00);
		Produto p42 = new Produto(null, "Produto 42", 10.00);
		Produto p43 = new Produto(null, "Produto 43", 10.00);
		Produto p44 = new Produto(null, "Produto 44", 10.00);
		Produto p45 = new Produto(null, "Produto 45", 10.00);
		Produto p46 = new Produto(null, "Produto 46", 10.00);
		Produto p47 = new Produto(null, "Produto 47", 10.00);
		Produto p48 = new Produto(null, "Produto 48", 10.00);
		Produto p49 = new Produto(null, "Produto 49", 10.00);
		Produto p50 = new Produto(null, "Produto 50", 10.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3, p12, p13, p18, p19, p20, 
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, 
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		cat2.getProdutos().addAll(Arrays.asList(p4, p14, p15));
		cat3.getProdutos().addAll(Arrays.asList(p5, p6));
		cat4.getProdutos().addAll(Arrays.asList(p7, p8, p9));
		cat5.getProdutos().addAll(Arrays.asList(p10));
		cat6.getProdutos().addAll(Arrays.asList(p11));
		cat7.getProdutos().addAll(Arrays.asList(p16, p17));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		p5.getCategorias().addAll(Arrays.asList(cat3));
		p6.getCategorias().addAll(Arrays.asList(cat3));
		p7.getCategorias().addAll(Arrays.asList(cat4));
		p8.getCategorias().addAll(Arrays.asList(cat4));
		p9.getCategorias().addAll(Arrays.asList(cat4));
		p10.getCategorias().addAll(Arrays.asList(cat5));
		p11.getCategorias().addAll(Arrays.asList(cat6));
		p12.getCategorias().add(cat1);
		p13.getCategorias().add(cat1);
		p14.getCategorias().add(cat2);
		p15.getCategorias().add(cat2);
		p16.getCategorias().add(cat7);
		p17.getCategorias().add(cat7);
		p18.getCategorias().add(cat1);
		p19.getCategorias().add(cat1);
		p20.getCategorias().add(cat1);
		p21.getCategorias().add(cat1);
		p22.getCategorias().add(cat1);
		p23.getCategorias().add(cat1);
		p24.getCategorias().add(cat1);
		p25.getCategorias().add(cat1);
		p26.getCategorias().add(cat1);
		p27.getCategorias().add(cat1);
		p28.getCategorias().add(cat1);
		p29.getCategorias().add(cat1);
		p30.getCategorias().add(cat1);
		p31.getCategorias().add(cat1);
		p32.getCategorias().add(cat1);
		p33.getCategorias().add(cat1);
		p34.getCategorias().add(cat1);
		p35.getCategorias().add(cat1);
		p36.getCategorias().add(cat1);
		p37.getCategorias().add(cat1);
		p38.getCategorias().add(cat1);
		p39.getCategorias().add(cat1);
		p40.getCategorias().add(cat1);
		p41.getCategorias().add(cat1);
		p42.getCategorias().add(cat1);
		p43.getCategorias().add(cat1);
		p44.getCategorias().add(cat1);
		p45.getCategorias().add(cat1);
		p46.getCategorias().add(cat1);
		p47.getCategorias().add(cat1);
		p48.getCategorias().add(cat1);
		p49.getCategorias().add(cat1);
		p50.getCategorias().add(cat1);

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, 
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

		Cliente cli1 = new Cliente(null, "Rafael José de Souza", "rafa.jo.souza@hotmail.com", "24689207089",
				TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli1.addPerfil(Perfil.ADMIN);
		cli1.getTelefones().addAll(Arrays.asList("01127363323", "01193838393"));
		
		Cliente cli2 = new Cliente(null, "Ana Costa", "rafa.jo.souza@gmail.com", "41462651003",
				TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli2.getTelefones().addAll(Arrays.asList("01129256894", "011989632514"));
		
		Cliente cli3 = new Cliente(null, "Fernando josé de Souza", "betynando@hotmail.com", "41462651003",
				TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli2.getTelefones().addAll(Arrays.asList("01129256894", "011989632514"));

		Endereco e1 = new Endereco(null, "Rua João Portes Del Rei", "300", "Apto 203", "Jardim Fanganiello", "08450520", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua Tacacá", "105", "Sala 800", "Jardim Jaraguá (Itaim Paulista)", "08160195", cli1, c2);
		
		Endereco e3 = new Endereco(null, "Rua Valentim Lemos", "2106", null, "Jardim São Paulo(Zona Leste)", "08430800", cli2, c2);

		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		cli2.getEnderecos().addAll(Arrays.asList(e3));
		cli3.getEnderecos().addAll(Arrays.asList(e2));

		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli1, e2);
		Pedido ped3 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli2, e3);

		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"),
				null);
		ped2.setPagamento(pagto2);
		Pagamento pagto3 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped3, sdf.parse("20/10/2017 00:00"),
				null);
		ped3.setPagamento(pagto3);

		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
		cli2.getPedidos().addAll(Arrays.asList(ped3));

		pedidoRepository.saveAll(Arrays.asList(ped1, ped2, ped3));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2, pagto3));

		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		ItemPedido ip4 = new ItemPedido(ped3, p7, 0.00, 1, 2800.00);

		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		ped3.getItens().addAll(Arrays.asList(ip4));

		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip3));
		p3.getItens().addAll(Arrays.asList(ip2));
		p7.getItens().addAll(Arrays.asList(ip4));

		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3, ip4));
	}
}
