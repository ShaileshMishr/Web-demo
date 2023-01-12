package com.training.jsf.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.training.jsf.validation.UserValidator")
public class UserValidator implements Validator{
	
	private static final String Name_PATTERN = "Shailesh";
	
	private Pattern pattern;
	private Matcher matcher;
	
	public UserValidator() {
		pattern = Pattern.compile(Name_PATTERN);
	}

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		matcher = pattern.matcher(value.toString());
		if(!matcher.matches()) {
			FacesMessage msg = new FacesMessage("Name Validation Failed..");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
		
	}

}
