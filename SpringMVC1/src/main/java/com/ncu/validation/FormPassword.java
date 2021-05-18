package com.ncu.validation;

import javax.validation.Payload;

public @interface FormPassword {

	// define default course code
		public String[] value() default "A1B2";

		// define default error message
		public String message() default "A1B2";

		// define default groups
		public Class<?>[] groups() default {};

		// define default payloads
		public Class<? extends Payload>[] payload() default {};
	
}
