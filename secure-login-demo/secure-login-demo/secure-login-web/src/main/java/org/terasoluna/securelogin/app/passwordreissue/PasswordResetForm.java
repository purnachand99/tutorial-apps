/*
 * Copyright (C) 2013-2018 NTT DATA Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.terasoluna.securelogin.app.passwordreissue;

import java.io.Serializable;

import org.terasoluna.gfw.common.validator.constraints.Compare;
import org.terasoluna.securelogin.app.common.validation.NotReusedPassword;
import org.terasoluna.securelogin.app.common.validation.StrongPassword;

import lombok.Data;

@Data
@Compare(left = "newPassword", right = "confirmNewPassword", operator = Compare.Operator.EQUAL)
@StrongPassword(usernamePropertyName = "username", newPasswordPropertyName = "newPassword")
@NotReusedPassword(usernamePropertyName = "username", newPasswordPropertyName = "newPassword")
public class PasswordResetForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;

	private String token;

	private String secret;

	private String newPassword;

	private String confirmNewPassword;
}
