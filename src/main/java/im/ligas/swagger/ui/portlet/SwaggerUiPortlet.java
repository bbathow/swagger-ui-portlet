package im.ligas.swagger.ui.portlet;

import im.ligas.swagger.ui.constants.SwaggerUiPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author ligasm
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false",
		"com.liferay.portlet.application-type=full-page-application",
		"com.liferay.portlet.application-type=widget",
		"com.liferay.portlet.header-portlet-javascript=/js/swagger-ui-bundle.js",
		"com.liferay.portlet.header-portlet-javascript=/js/swagger-ui-standalone-preset.js",
		"com.liferay.portlet.header-portlet-css=/css/swagger-ui.css",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SwaggerUiPortletKeys.SwaggerUi,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SwaggerUiPortlet extends MVCPortlet {
}
