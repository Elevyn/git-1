package BizkaiaBasket.copy;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class VentanaGEquipos extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelFondo;
	private JScrollPane scpGEquipos;
	private JTable tblGEquipos;
	private static JTextField txtCodigo;
	private static JTextField txtNombre;
	private static JTextField txtMunicipio;
	private static JTextField txtEmail;
	private static JTextField txtTj;
	private JLabel lblCodigo;
	private JLabel lblEquipo;
	private JLabel lblEquipo_1;
	private JLabel lblGEquipos;
	private JLabel lblFecha;
	private JLabel lblResultado;
	private JLabel lblFondo;
	private JButton btnEliminar;
	private JButton btnCrear;
	private JButton btnModificar;
	private JButton btnVolver;

	// Definir la tabla
	static DefaultTableModel tblgu = new DefaultTableModel();

	// Definir Necesidades Previas
	int row;

	public VentanaGEquipos() {
		setTitle("Gesti\u00F3n Equipos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 510);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panelFondo = new JPanel();
		contentPane.add(panelFondo, BorderLayout.CENTER);
		panelFondo.setLayout(null);

		lblResultado = new JLabel("T. Juego");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Arial", Font.BOLD, 15));
		lblResultado.setForeground(SystemColor.controlLtHighlight);
		lblResultado.setBounds(460, 340, 107, 27);
		panelFondo.add(lblResultado);

		lblFecha = new JLabel("E-Mail");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setFont(new Font("Arial", Font.BOLD, 15));
		lblFecha.setForeground(SystemColor.controlLtHighlight);
		lblFecha.setBounds(355, 340, 107, 27);
		panelFondo.add(lblFecha);

		lblEquipo_1 = new JLabel("Municipio");
		lblEquipo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblEquipo_1.setForeground(SystemColor.controlLtHighlight);
		lblEquipo_1.setBounds(248, 339, 107, 28);
		panelFondo.add(lblEquipo_1);

		lblEquipo = new JLabel("Nombre");
		lblEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo.setForeground(SystemColor.controlLtHighlight);
		lblEquipo.setFont(new Font("Arial", Font.BOLD, 15));
		lblEquipo.setBounds(144, 340, 107, 28);
		panelFondo.add(lblEquipo);

		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setFont(new Font("Arial", Font.BOLD, 15));
		lblCodigo.setForeground(SystemColor.controlLtHighlight);
		lblCodigo.setBounds(40, 339, 107, 28);
		panelFondo.add(lblCodigo);

		lblGEquipos = new JLabel("Gesti\u00F3n de Equipos");
		lblGEquipos.setForeground(SystemColor.textHighlightText);
		lblGEquipos.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblGEquipos.setBounds(129, 44, 220, 39);
		panelFondo.add(lblGEquipos);

		txtTj = new JTextField();
		txtTj.setBounds(460, 368, 107, 28);
		panelFondo.add(txtTj);
		txtTj.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(355, 368, 107, 28);
		panelFondo.add(txtEmail);
		txtEmail.setColumns(10);

		txtMunicipio = new JTextField();
		txtMunicipio.setBounds(248, 368, 110, 28);
		panelFondo.add(txtMunicipio);
		txtMunicipio.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setBounds(144, 368, 107, 28);
		panelFondo.add(txtNombre);
		txtNombre.setColumns(10);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(40, 368, 107, 28);
		panelFondo.add(txtCodigo);
		txtCodigo.setColumns(10);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 12));
		btnEliminar.setBackground(Color.WHITE);
		btnEliminar.setBounds(402, 408, 89, 39);
		panelFondo.add(btnEliminar);

		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Arial", Font.BOLD, 12));
		btnModificar.setBackground(Color.WHITE);
		btnModificar.setBounds(256, 408, 89, 39);
		panelFondo.add(btnModificar);

		btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Arial", Font.BOLD, 12));
		btnCrear.setBackground(Color.WHITE);
		btnCrear.setBounds(105, 408, 95, 39);
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GEquipos.CrearEquipo(Integer.parseInt(txtCodigo.getText()), txtNombre.getText(), txtMunicipio.getText(), txtEmail.getText(), txtTj.getText());
			}
		});
		panelFondo.add(btnCrear);

		scpGEquipos = new JScrollPane();
		scpGEquipos.setBounds(53, 99, 482, 183);
		panelFondo.add(scpGEquipos);

		tblGEquipos = new JTable();
		tblGEquipos.setFont(new Font("Arial", Font.PLAIN, 12));
		tblGEquipos.setShowHorizontalLines(false);
		scpGEquipos.setViewportView(tblGEquipos);
		tblGEquipos.setBorder(new EmptyBorder(5, 5, 5, 5));
		tblGEquipos.setBackground(new Color(233, 150, 122));
		tblgu.addColumn("Codigo");
		tblgu.addColumn("Nombre");
		tblgu.addColumn("Municipio");
		tblgu.addColumn("Email");
		tblgu.addColumn("Terreno");
		tblGEquipos.setModel(GEquipos.equipos);

		btnVolver = new JButton("");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnVolver();
			}
		});
		btnVolver.setIcon(new ImageIcon(VentanaGEquipos.class.getResource("/BizkaiaBasket/arrowleft.png")));
		btnVolver.setFont(new Font("Arial", Font.BOLD, 20));
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setBounds(0, 0, 48, 36);
		panelFondo.add(btnVolver);

		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(VentanaGEquipos.class.getResource("/BizkaiaBasket/Fondo.png")));
		lblFondo.setBounds(0, 0, 604, 481);
		panelFondo.add(lblFondo);
	}

	private void BtnVolver() {
		GUsuarios.IrAPrincipal();// AbrirVentanas.vePAdmin();
		dispose(); // Elimina el objeto en memoria (cierra la ventana)

	}

	public static int getTxtCodigo() {
		return Integer.parseInt(txtCodigo.getText());
	}

	public static String getTxtNombre() {
		return txtNombre.getText();
	}

	public static String getTxtMunicipio() {
		return txtMunicipio.getText();
	}

	public static String getTxtEmail() {
		return txtEmail.getText();
	}

	public static String getTxtTj() {
		return txtTj.getText();
	}

}
