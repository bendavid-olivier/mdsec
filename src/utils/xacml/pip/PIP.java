package utils.xacml.pip;

import com.sun.xacml.finder.impl.CurrentEnvModule;

public class PIP {
	private CurrentEnvModule envModule;
	
	public PIP(){
		envModule = new CurrentEnvModule();
	}

	public CurrentEnvModule getEnvModule() {
		return envModule;
	}

	public void setEnvModule(CurrentEnvModule envModule) {
		this.envModule = envModule;
	}
}
