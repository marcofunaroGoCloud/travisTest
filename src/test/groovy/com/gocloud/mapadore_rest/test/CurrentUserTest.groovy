package com.gocloud.mapadore_rest.test;

import org.junit.Test
import spock.lang.Specification


class CurrentUserTest extends Specification {

	@Test
	public void 'boolean not change truth value'() {
		setup:
			def b = false

		when: 
			def a = !b
		
		then:
			a == false

	}


}
