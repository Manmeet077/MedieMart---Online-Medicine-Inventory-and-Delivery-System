# MedieMart---Online-Medicine-Inventory-and-Delivery-System

# 💊 MedieMart – Online Medicine Inventory and Delivery System

**MedieMart** is a full-stack web application for managing medical product inventory, user login/register, admin dashboard, shopping cart, and medicine ordering. It is built using:

- **Frontend**: HTML, CSS (inline), JavaScript (`mediemart.js`)
- **Backend**: Java (Spring Boot), MySQL
- **Architecture**: RESTful API with JSON data exchange
- **Deployment**: Compatible with Render (Spring Boot backend) + GitHub Pages or any static frontend hosting

---

## ✅ Features

### 👤 User Side
- User **registration** and **login**
- View **medicine products** dynamically from the backend
- **Add to cart** and **remove from cart**
- View **cart summary** with total
- Place order (order stored in DB with unique order number)

### 🔐 Admin Side
- Separate **admin login**
- Admin can **add/delete medicine products**
- Admin dashboard shows product management options

---

## 🔗 API Endpoints

| Method | Endpoint                  | Description                        |
|--------|---------------------------|------------------------------------|
| POST   | `/api/register`           | Register a new user                |
| POST   | `/api/login`              | Login as user or admin             |
| GET    | `/api/products`           | Fetch all products                 |
| POST   | `/api/products`           | Admin adds new product             |
| DELETE | `/api/products/{name}`    | Admin deletes a product            |
| POST   | `/api/order`              | User places an order               |

---

## 🗂️ Project Structure

