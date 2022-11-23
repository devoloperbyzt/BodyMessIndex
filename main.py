while True:
    print("Hoşgeldiniz vicut kitle kitle endeksi ile ne kadar kilolu olduğunuzu ölçün.")  # welcome message
    Weight = int(input("Lütfen kilonuzu(kg) giriniz."))  # input user's weight
    Height = float(input("Lütfen boyunuzu(m) giriniz."))  # input user's height
    Result = Weight/(Height*Height)  # calculate body mess index
    if Result <= 18.5:  # thin
        print("Çok zayıfsınız.")

    elif 18.5 < Result <= 24.9:  # normal kilo
        print("ideal kilodasınız.")

    elif 25 <= Result <= 29.9:  # overweight
        print("ideal kilonun üstündesiniz.")

    elif 30 <= Result < 40:  # normal weight
        print("ideal kilonun çok fazla üstündesiniz.") #

    elif Result >= 40:  # obese
        print("Aşırı kilolusunuz obez olma riskiniz var")

