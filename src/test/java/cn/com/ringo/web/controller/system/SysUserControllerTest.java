package cn.com.ringo.web.controller.system;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { MockServletContext.class })
public class SysUserControllerTest {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new SysUserController()).build();
	}

	@Test
	public void getSysUser() throws Exception {
		RequestBuilder request = null;
		request = get("/system/sysuser/1");

		System.out.println(mvc.perform(request).andReturn().getResponse().getContentType());
		
		//mvc.perform(request).andExpect(status().isOk()).andExpect((ResultMatcher) content().string(equalTo("[]")));
		
	}

}
