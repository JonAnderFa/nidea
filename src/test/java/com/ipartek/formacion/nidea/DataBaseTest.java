package com.ipartek.formacion.nidea;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class DataBaseTest {

	@Test
	public void test() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			fail("no existe driver para mysql,¿Tienes el .JAR");
		}
	}

	@Test
	public void testConexion() {
		String connectionUrl = "jdbc:mysql://192.168.0.42/spoty";
		try {
			Connection con = DriverManager.getConnection(connectionUrl, "alumno", "alumno");
			assertTrue(true);
		} catch (SQLException e) {
			e.printStackTrace();
			fail("No se pudo establecer conexion" + connectionUrl);
		}

	}

}
