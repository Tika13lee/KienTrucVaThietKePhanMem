package org.example.lethithuykieu_jms.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.lethithuykieu_jms.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/order")
public class OrderProductController {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    @GetMapping("")
    public String orderProduct() {
        return "order";
    }

    @GetMapping("/create")
    public ModelAndView orderProductPost() {
        ModelAndView modelAndView = new ModelAndView("detail");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String quantity = request.getParameter("quantity");
        Product product = new Product(name, Double.parseDouble(price), Integer.parseInt(quantity));
        modelAndView.addObject("orderProduct", product);
        return modelAndView;
    }


}
