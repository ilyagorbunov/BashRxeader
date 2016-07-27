package com.bashrexeader.bashrxeader.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Davey on 26.07.2016.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME) //эта аннотация будет доступна только в runtime
public @interface ApplicationContext {





}
