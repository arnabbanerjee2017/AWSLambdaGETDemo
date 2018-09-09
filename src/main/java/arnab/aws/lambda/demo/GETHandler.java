package arnab.aws.lambda.demo;

import java.util.function.Supplier;

import org.springframework.stereotype.Component;

@Component("getHandler")
public class GETHandler implements Supplier<String> {

	@Override
	public String get() {
		return "Hello World!";
	}

}
