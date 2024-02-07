package com.green.shop.cart.service;

import com.green.shop.cart.vo.CartVO;
import com.green.shop.cart.vo.CartViewVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements  CartService{
    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public void insertCart(CartVO cartVO) {

        //현재 내 장바구니에 추가 하려는 상품이 있는지 확인
        int cnt = sqlSession.selectOne("cartMapper.checkCart", cartVO);

        System.out.println("cnt : " + cnt);
        if(cnt == 0){
            sqlSession.insert("cartMapper.insertCart", cartVO);
        }
        else{
            sqlSession.update("cartMapper.plusCartCnt", cartVO);
        }
    }


    @Override
    public List<CartViewVO> selectCartList(String memberId) {
        return sqlSession.selectList("cartMapper.selectCartList", memberId);
    }

    @Override
    public void deleteCart(int cartCode) {
        sqlSession.delete("cartMapper.deleteCart", cartCode);
    }

    @Override
    public void updateCnt(CartVO cartVO) {
        sqlSession.update("cartMapper.updateCartCnt", cartVO);
    }

}
