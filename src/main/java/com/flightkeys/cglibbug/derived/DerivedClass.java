package com.flightkeys.cglibbug.derived;

import com.flightkeys.cglibbug.base.BaseClass;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DerivedClass extends BaseClass {
}
