-- Returns user info for authentication
SELECT id, email, password
FROM "app_user"
WHERE email = ?; 

