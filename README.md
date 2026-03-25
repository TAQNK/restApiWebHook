# 📡 Webhook API (Learning Project)

This is a simple Webhook API built for learning purposes.
The API is designed to respond only to specific messages: **"hi"** and **"goodbye"**.

---

## 🚀 Base URL

```
https://webhook-mkmz.onrender.com/webhook
```

---

## 📌 Endpoint Details

### 🔹 POST `/webhook`

Send a POST request to interact with the API.

---

## 📥 Request Body

Send JSON data in the following format:

```json
{
  "sender": "Tanishq",
  "message": "Bye"
}
```

### Fields:

* **sender** → Name of the user sending the message
* **message** → Message content (only "hi" or "goodbye" will get valid responses)

---

## 📤 Response Behavior

| Message Sent | Response                                  |
| ------------ | ----------------------------------------- |
| hi           | Greeting response                         |
| goodbye      | Farewell response                         |
| any other    | No meaningful response / default response |

---

## 🧪 Testing with Postman

1. Open **Postman**
2. Select **POST** method
3. Enter the URL:

   ```
   https://webhook-mkmz.onrender.com/webhook
   ```
4. Go to **Body → raw → JSON**
5. Paste the request body:

   ```json
   {
     "sender": "Tanishq",
     "message": "Bye"
   }
   ```
6. Click **Send**

---

## ⚠️ Notes

* This API is created for **learning and demonstration purposes only**
* It supports **limited message inputs**
* Not intended for production use

---

## 👨‍💻 Author

**Tanishq Pal**

---

## 📄 License

This project is open-source and free to use for educational purposes.
