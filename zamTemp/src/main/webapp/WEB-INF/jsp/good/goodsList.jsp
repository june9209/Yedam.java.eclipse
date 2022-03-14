<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>상품리스트화면</h3>
<!-- 아래에 코드를 작성하세요!! -->


<div class="col mb-3" style="width:100%;">

<c:forEach var="list" items="${list }">
<div class="col mb-5" style="width: 25%; float:left;" >
  <div class="card h-100" >
                        <!-- Sale badge-->
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale
                        </div>
                        <!-- Product image-->
                        <img class="card-img-top" src="images/${list.prodImage }" alt="..." style=" width:100%;height:600px;"/>
                        <!-- Product details-->
                        <div class="card-body p-4">
                            <div class="text-center">
                                <!-- Product name-->
                                <h5 class="fw-bolder">${list.prodName }</h5>
                                <!-- Product reviews-->
                                <div class="d-flex justify-content-center small text-warning mb-2">
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                </div>
                                <!-- Product price-->
                                <span class="text-muted text-decoration-line-through">${list.prodPrice }</span>
                               ${list.salePrice }
                            </div>
                        </div>
                        <!-- Product actions-->
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a>
                            </div>
                        </div>
                    </div>
                </div>
</c:forEach>

                    <!-- <div class="card h-100" >
                        Sale badge
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale
                        </div>
                        Product image
                        <img class="card-img-top" src="images/bakery1.PNG" alt="..." style=" width:100%;height:600px;"/>
                        Product details
                        <div class="card-body p-4">
                            <div class="text-center">
                                Product name
                                <h5 class="fw-bolder"></h5>
                                Product reviews
                                <div class="d-flex justify-content-center small text-warning mb-2">
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                </div>
                                Product price
                                <span class="text-muted text-decoration-line-through">$20.00</span>
                                $16.00
                            </div>
                        </div>
                        Product actions
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col mb-5" style="width: 25%; float:left;">
                    <div class="card h-100">
                        Sale badge
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale
                        </div>
                        Product image
                        <img class="card-img-top" src="images/bakery2.PNG" alt="..." style=" width:100%;height:600px;"/>
                        Product details
                        <div class="card-body p-4">
                            <div class="text-center">
                                Product name
                                <h5 class="fw-bolder">두부텐더 콥샐러드</h5>
                                Product reviews
                                <div class="d-flex justify-content-center small text-warning mb-2">
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                </div>
                                Product price
                                <span class="text-muted text-decoration-line-through">$20.00</span>
                                $12.00
                            </div>
                        </div>
                        Product actions
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col mb-5" style="width: 25%; float:left;">
                    <div class="card h-100">
                        Sale badge
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale
                        </div>
                        Product image
                        <img class="card-img-top" src="images/bakery3.PNG" alt="..." style=" width:100%;height:600px;"/>
                        Product details
                        <div class="card-body p-4">
                            <div class="text-center">
                                Product name
                                <h5 class="fw-bolder">클래식 미니 스콘</h5>
                                Product reviews
                                <div class="d-flex justify-content-center small text-warning mb-2">
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                </div>
                                Product price
                                <span class="text-muted text-decoration-line-through">$20.00</span>
                                $13.00
                            </div>
                        </div>
                        Product actions
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col mb-5" style="width: 25%; float:left;">
                    <div class="card h-100">
                        Sale badge
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale
                        </div>
                        Product image
                        <img class="card-img-top" src="images/bakery4.PNG" alt="..." style=" width:100%;height:600px;" />
                        Product details
                        <div class="card-body p-4">
                            <div class="text-center">
                                Product name
                                <h5 class="fw-bolder">레몬 파운드 케잌</h5>
                                Product reviews
                                <div class="d-flex justify-content-center small text-warning mb-2">
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                </div>
                                Product price
                                <span class="text-muted text-decoration-line-through">$20.00</span>
                                $15.00
                            </div>
                        </div>
                        Product actions
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a>
                            </div>
                        </div>
                    </div>
                     </div>
       -->         
</div>
</div>