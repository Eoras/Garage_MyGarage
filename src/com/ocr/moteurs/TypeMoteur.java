package com.ocr.moteurs;

import java.io.Serializable;

public enum TypeMoteur implements Serializable {
	DIESEL(),
	ESSENCE(),
	HYBRIDE(),
	ELECTRIQUE();
}
