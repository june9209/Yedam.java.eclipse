<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h3>로그인 화면</h3>
<!-- 로그인 화면에 추가 코드를 작성할 필요 없습니다. 로그인 클릭 시 나타나는 화면입니다. -->
    <section class="py-5">
        <div class="container px-4 px-lg-5 my-5">
        <h2 class="fw-bolder mb-4">1) 상품 상세 화면</h2>
            <div class="row gx-4 gx-lg-5 align-items-center">
                <div class="col-md-6">
                <img class="card-img-top mb-5 mb-md-0"
                        src="https://dummyimage.com/600x700/dee2e6/6c757d.jpg" alt="..." /></div>
                <div class="col-md-6">
                    <div class="small mb-1">SKU: BST-498</div>
                    <h1 class="display-5 fw-bolder">Shop item template</h1>
                    <div class="fs-5 mb-5">
                        <span class="text-decoration-line-through">$45.00</span>
                        <span>$40.00</span>
                    </div>
                    <p class="lead">Lorem ipsum dolor sit amet consectetur adipisicing elit. Praesentium at dolorem
                        quidem modi. Nam sequi consequatur obcaecati excepturi alias magni, accusamus eius blanditiis
                        delectus ipsam minima ea iste laborum vero?</p>
                    <div class="d-flex">
                        <input class="form-control text-center me-3" id="inputQuantity" type="num" value="1"
                            style="max-width: 3rem" />
                        <button class="btn btn-outline-dark flex-shrink-0" type="button">
                            <i class="bi-cart-fill me-1"></i>
                            Add to cart
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </section>

<section class="py-5">
	<div class="container px-4 px-lg-5 my-5">
		<h2 class="fw-bolder mb-4">1) 상품 상세 화면</h2>
		<div class="row gx-4 gx-lg-5 align-items-center">
			<form>
				<table border="1">
					<tr>
						<th>아이디</th>
						<td><input type="text"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</section>